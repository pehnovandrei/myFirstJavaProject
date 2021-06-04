class helloWorld {
	public static void main (String[] args){
		if (args.length >= 3)
		{
			life myLife = new life();
			goodbyeWorld goodbye = new goodbyeWorld();
			System.out.println( args[0] + " world!");
			myLife.live(args[1]);
			goodbye.bye(args[2]);
		}
	}
}