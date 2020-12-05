package br.quirinoneto.classes;

import br.quirinoneto.interfaces.ValoresITF;

public class Valores implements ValoresITF {

	
	int array[] = new int[10];

	@Override
	public boolean ins(int v) {
		// TODO Auto-generated method stub
		
		for(int a = 0; a < array.length; a++) {
			if (array[a] == 0) {
				array[a] = v;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int del(int i) {
		// TODO Auto-generated method stub
		
		int aux = 0;
		boolean flag = false;
		
		for (int a = 0; a < array.length; a++) {
			if (array[i] != 0) {
				flag = true;
			}
		}
				
		if (flag) {
			if (i >= 0 && i <= 9) {
				aux = array[i];
				array[i] = 0;
			}
			return aux;
		} else {
			return -1;
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		for ( int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				cont++;
			}
		}
		
		return cont;
	}
	
}
