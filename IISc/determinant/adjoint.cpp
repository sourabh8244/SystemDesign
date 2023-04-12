#include <bits/stdc++.h>
#include <iostream>

using namespace std;


/*

1 2 3
-1 2 5
4 3 1

*/

int determinant(vector<vector<int>> mat){
    int m = mat.size();
    int n = mat[0].size();
    if(m!=n){
        cout<<"not square matrix";
        return 0;
    }
    
    if(m==2){
        return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
    }
    
    int det = 0;
    for(int i=0; i<m; i++){
        vector<vector<int>> newMat(m-1, vector<int>(m-1));
        for(int j = 1; j<m; j++){
            for(int k = 0; k<m; k++){
                if(k==i) continue;
                newMat[j-1][k<i?k:k-1] = mat[j][k];
            }
        }
        det += i%2==0? mat[0][i]*determinant(newMat) : -1*mat[0][i]*determinant(newMat);
    }
    return det;
}

vector<vector<int>> cofactor(vector<vector<int>> mat, int a, int b){
    int m = mat.size();
    vector<vector<int>> cofactorMatrix(m-1, vector<int>(m-1));
    for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
            if(i==a || j==b) continue;
            cofactorMatrix[i<a?i:i-1][j<b?j:j-1] = mat[i][j];
        }
    }
    return cofactorMatrix;
}

vector<vector<int>> adjoint(vector<vector<int>> mat){
    int m = mat.size();
    int n = mat[0].size();
    if(m!=n) return {{}};
    vector<vector<int>> ad(m, vector<int>(m));

    for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
            ad[j][i] = determinant(cofactor(mat, i, j));
            if((i+j)%2!=0) ad[j][i]*=-1;
        }
    }
    return ad;
}


vector<vector<double>> inverse(vector<vector<int>> mat, int det){
    int m = mat.size();
    vector<vector<double>> inv(m, vector<double>(m));
    for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
            inv[i][j] = double(mat[i][j])/det;
        }
    }
    return inv;
}



int main()
{
    int m, n;
    cout<<"enter the value for m: ";
    cin>>m;
    cout<<"enter the value for n: ";
    cin>>n;
    
    vector<vector<int>> A(m, vector<int>(n));
    
    
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            cin>>A[i][j];
        }
    }
    
    vector<vector<int>> adj = adjoint(A);
    int detA = determinant(A);

    cout<<"Adjoint of given matrix: "<<endl;
    for(int i=0; i<adj.size(); i++){
        for(int j=0; j<adj[0].size(); j++){
            cout<<adj[i][j]<<" ";
        }
        cout<<endl;
    }
    cout<<endl;
    cout<<"Determinant of given matrix: "<<detA<<endl;
    cout<<endl;
    

    vector<vector<double>> inv = inverse(adj, detA);
    cout<<"Inverse of given matrix: "<<endl;
    for(int i=0; i<inv.size(); i++){
        for(int j=0; j<inv[0].size(); j++){
            cout<<inv[i][j]<<" ";
        }
        cout<<endl;
    }

    return 0;
    
}