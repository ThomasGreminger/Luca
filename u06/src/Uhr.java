import gui.Window;

public class Uhr {
	private static final int SIZE = 400;

	public static void main(String[] args) {
		Window window = new Window("Uhr", SIZE, SIZE);
		window.open();

		while (window.isOpen()) {
			// TODO: draw clock
			window.setColor(190, 190, 190);
			window.fillCircle(200,200,180);
			
			long sekunden = System.currentTimeMillis() / 1000;
			long sekZeiger = sekunden % 60;
			long minuten = sekunden / 60;
			long minZeiger = minuten % 60;
			double stunden = minuten / 60.0;
			double stdZeiger = (stunden + 2) % 12;
			double sekWinkel = sekZeiger/60.0*2*Math.PI;
			double minWinkel = minZeiger/60.0*2*Math.PI;
			double stdWinkel = stdZeiger/12.0*2*Math.PI;
			int sekZeigerLaenge=110;
			int minZeigerLaenge=100;
			int stdZeigerLaenge=50;
			
			double temp1= Math.random()*255.0;
			double temp2= Math.random()*255.0;
			double temp3= Math.random()*255.0;
			int color1 = (int) temp1;
			int color2 = (int) temp2;
			int color3 = (int) temp3;
			
			window.setColor(color1, color2, color3);
			window.setStrokeWidth(2);
			window.drawLine(200, 200,200+ Math.sin(sekWinkel)*sekZeigerLaenge,200- Math.cos(sekWinkel)*sekZeigerLaenge);
			
			window.setStrokeWidth(5);
			window.drawLine(200, 200,200+ Math.sin(minWinkel)*minZeigerLaenge,200- Math.cos(minWinkel)*minZeigerLaenge);
			
			window.drawLine(200, 200, 200+Math.sin(stdWinkel)*stdZeigerLaenge,200- Math.cos(stdWinkel)*stdZeigerLaenge);
			
			
			
//            System.out.println(sekZeiger);
			// display everything and then fill the canvas with white:
			window.refreshAndClear(200);
		}
	}
}
