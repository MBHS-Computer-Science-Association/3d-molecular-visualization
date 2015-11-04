package simulation;

public class UpdateLoop implements Runnable{

	public void update() {
		// for each element of elementList, update them;
	}

	public void run() {
		
		boolean running = true;
		
		long lastTime = System.nanoTime();
		double delta = 0.0;
		double ns = 1000000000.0 / 60.0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1.0) {
			try{	
				update();
			} catch(Exception e){
				e.printStackTrace();
				System.err.println("Update " + updates + " failed at " + System.currentTimeMillis());
			}
				updates++;
				delta--;
			}
	
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(updates + " ups");
				updates = 0;
			}
	}
		

		
	}

	
}
