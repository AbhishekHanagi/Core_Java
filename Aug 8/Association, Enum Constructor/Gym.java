class Gym
{
	String name;
	double fees;
	String[] equipments;  //array
	Trainer trainer;  //association
	
	Gym(String name,double fees,String[] equipments)
	{
		this.name=name;
		this.fees=fees;
		this.equipments=equipments;
		//System.out.println("Gym Contructor String,double,String[]");
	}
	
	void setTrainer(Trainer trainer)
	{
		this.trainer=trainer;
		//System.out.println("Gym Method trainer");
	}
	void details()
	{
		System.out.println(this.name);
		System.out.println(this.fees);
		for(int eqt=0; eqt<this.equipments.length; eqt++)
		{
			System.out.println(this.equipments[eqt]);
		}
		trainer.printDatas();
	}
}