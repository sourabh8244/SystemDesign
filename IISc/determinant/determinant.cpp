#include <bits/stdc++.h>
#include <iostream>

using namespace std;

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
        
        /*for(int j = 0; j<m-1; j++){
            for(int k = 0; k<m-1; k++){
                cout<<newMat[j][k]<<" ";
            }
            cout<<endl;
        }
        cout<<endl;
        */
        //int d = i%2==0? mat[0][i]*determinant(newMat) : -1*mat[0][i]*determinant(newMat);
        det += i%2==0? mat[0][i]*determinant(newMat) : -1*mat[0][i]*determinant(newMat);
        //det += d;
        //cout<<d<<" "<<m<<endl;
    }
    return det;
}


int main()
{
    int m, n;
    cout<<"enter the value for m: ";
    cin>>m;
    cout<<"enter the value for n: ";
    cin>>n;

    //int m = 3, n = 3;
    
    vector<vector<int>> A(m, vector<int>(n));
    
    
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            cin>>A[i][j];
        }
    }
    
    cout<<determinant(A);
    
    
    return 0;
    
}
