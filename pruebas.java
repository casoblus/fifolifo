class pruebas
{
	public static void main( String[] args )
	{
		Fila filita = new Fila();
		filita.CREAR(5);

		filita.FREE();
		filita.ENCOLAR(1);
		filita.ENCOLAR(2);
		filita.ENCOLAR(3);
		filita.VISUALIZAR();
		filita.FREE();
		filita.ENCOLAR(4);
		filita.VISUALIZAR();
		filita.FREE();
		filita.ENCOLAR(5);
		filita.FREE();

		filita.VISUALIZAR();

		filita.DESENCOLAR();
		filita.VISUALIZAR();
		filita.FREE();
		filita.DESENCOLAR();
		filita.FREE();
		filita.DESENCOLAR();
		filita.VISUALIZAR();
		filita.FREE();
	
		filita.VISUALIZAR();
		
		
		System.out.println( "La fila está vacía?" + filita.EMPTY() );
		System.out.println( "La fila está llena?" + filita.FULL() );
	}
}
