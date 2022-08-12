enum Gender
{
	MALE('M'),FEMALE('F'),OTHERS('O');
	
	char value;  //char constructor
	
	Gender(char value)
	{
		this.value=value;
	}
}