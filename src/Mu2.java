class Mu2 extends Multi{
	
	//Умноженная матрица	
	
	public void multimatrix(){
		System.out.println("Умноженная матрица : ");
		for (int i=0; i<3; i++){
		for (int j=0; j<2; j++){
		mass3[i][j]=0;
		for (int k=0; k<4; k++){
		mass3[i][j] =mass3[i][j] + mass1[i][k] * mass2[k][j];
		}
		System.out.print(mass3[i][j]+" ");
		}
		System.out.println();
		}
}
	}
