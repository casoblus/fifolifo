// PILAS LIFO

class Pila
{
 	private int[] arr;
	/**
	 * Contadores
	 **/
	private int length;
	private int first = 0;
	private int last = 0; // Al principio el array esta vacio

	public void Fila( int size )
	{
		arr = new int[size];
	}

	/**
	 * Push. inserta al final del array
	 **/

	public void PUSH( int i ) 
	{	
		if( last++ < this.length )
		{
	 		arr[last] = i;
			last++;
		} else {
			System.out.println( "No se pudo realizar. Array lleno." );
		}
	}

	/**
	 * Size. devuelve la cantidad de elementos ocupados en el array.
	 **/

	public int SIZE()
	{
	  	return first - last;
	}

	/**
	 * POP. Devuelve y elimina el último elemento.
	 **/

	public int POP() 
	{
		if( this.EMPTY() == false ) // comrpueba que no está vacío
		{
			last--; // Retrocede una posicion
			int num = arr[last]; // guarda el valor de la ultima posición
			return num; // retorna el valor guardado
			/*
			 * El último valor no se ha eliminado físicamente pero, 
			 * el indicador "puntero" se ha fijado en la posición anterior
			 * con lo que al añadir otro elemento "PUSH" se sobreescribirá.
			 * Es como si se hubiera marcado como borrable.
			 */
		} 
		return 0; // Esto no es válido ya que 0 puede ser un valor en el array
	}	
		
	/**
	 * TOP. Devuelve el ultimo valor pero no lo elimina.
	 **/

	public int TOP() 
	{
	 	return arr[ last - 1 ];
	}

	// PEEK = TOP;

	public int PEEK() 
	{
	 	return this.TOP();
	}

	/**
	 * EMPTY. Devuelve true si el array esta vacio
	 **/

	public boolean EMPTY()
	{
		if( last == 0 )
			return true;
		else 
			return false;
	}
}
