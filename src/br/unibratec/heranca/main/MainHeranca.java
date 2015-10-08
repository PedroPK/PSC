package br.unibratec.heranca.main;

import br.unibratec.util.UtilJPA;

public class MainHeranca {
	
	public static void main(String[] args) {
		SubMainHerancaSingleTable.main(args);
		
		UtilJPA.closeEntityManagerFactory();
	}
	
}