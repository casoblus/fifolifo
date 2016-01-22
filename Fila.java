// Filas FIFO
//
class Fila 
{	
	int[] arr;
	int first = 0; // Esto, en este caso no es necesario pero tampoco estorba mucho.
	int last = 0;
	
	// Constructor de la clase
	/*
	public void Fila( int size )
	{
		this.CREAR( size );
	}
	*/

	// CREAR. Crea una fila
	public void CREAR( int size )
	{
	 	arr = new int[ size ];
	}
	// ENCOLAR. Pone cosas al final.
	 
	public void ENCOLAR( int valor )
	{
		arr[ last ] = valor;
		last++; 
	}
	
	/**
	 * Desencolar. Devuelve el primer elemento de la fila. 
	 * Tendrá que mover todos los elementos una 
	 **/

	public void DESENCOLAR()
	{
		// sacar el primer elemento
		// int num = arr[0]; // NO DEVUELVE NADA, NO NECESITO GUARDAR NADA
		
		// mover todos los elementos una posicion
		for( int i = 0; i < last - 1; i++ )
		{
			if( i+1 < arr.length ) // El ultimo valor posible del array es arr.length-1
			{
				arr[i]=arr[i+1];
			}
		//	this.VISUALIZAR();
		}
		last--; 
		// Como he movido todos los elementos, 
		// tambien tengo que retrasar el puntero 
		// que indica el siguente libre.
	}


	// EMPTY
	public boolean EMPTY()
	{
		if( last == first ) // En el caso de las filas, first siempre es cero
		{
			return true;	
		}
		return false;
	}
	// TOP. Devuelve el último valor de la 
	
	

	
	// FULL
	public boolean FULL()
	{
		if( last == arr.length )
		{
			return true;
		}
		return false;
	}

	// EXTRA. Saber cuantas posiciones quedan disponibles.
	public void FREE()
	{
		// Las posiciones libres serán las que existan 
		// entre el puntero last y el tamaño del array
		
		int free = arr.length - last;
		System.out.println( "Disponibles: " + free + " posiciones." );
		System.out.println( );
	}

	public void VISUALIZAR()
	{
		for( int i = 0; i < last; i++ )
		{
			System.out.println( i + ": " + arr[i] );
		}
		System.out.println( );
	}
}
