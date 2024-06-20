package array;
import java.util.ArrayList;
	
	interface Playable {
	    void play();
	    void pause();
	    void stop();
	}

	
	class MusicPlayer implements Playable {
	    public void play() {
	        System.out.println("MusicPlayer is playing music.");
	    }
	    
	    public void pause() {
	        System.out.println("MusicPlayer has paused music.");
	    }
	    
	    public void stop() {
	        System.out.println("MusicPlayer has stopped music.");
	    }
	}

	
	class VideoPlayer implements Playable {
	    public void play() {
	        System.out.println("VideoPlayer is playing video.");
	    }
	    
	    public void pause() {
	        System.out.println("VideoPlayer has paused video.");
	    }
	    
	    public void stop() {
	        System.out.println("VideoPlayer has stopped video.");
	    }
	}

	public class Main1 { 
		
	    public static void main(String[] args) {
	        // Create an ArrayList of Playable objects
	        ArrayList<Playable> players = new ArrayList<>();
	        
	        // Add MusicPlayer and VideoPlayer objects to the list
	        players.add(new MusicPlayer());
	        players.add(new VideoPlayer());
	        
	        // Test polymorphic behavior
	        for (Playable player : players) {
	            player.play();
	            player.pause();
	            player.stop();
	        }
	    }
		}



