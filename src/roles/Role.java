package roles;

import java.util.HashSet;

import game.Game;
import game.Player;

public abstract class Role {
	
	protected String copResult = " is a cop.";
	protected String wolfResult = " is the wolf.";
	protected Player target;
	protected boolean targetSet = false;
	protected Player actor;
	
	public Role(){
		
	}

	public abstract void doAction(Game g);
	
	public void setActor(Player p){
		actor = p;
	}
	
	public void setTarget(Player p){
		target = p;
		targetSet = true;
	}
	
	public boolean isTargetSet(){
		return targetSet;
	}
	
	/**Prepares the role for the next cycle by resetting the target to null.*/
	public void resetTarget(){
		target = null;
		targetSet = false;
	}
	
	public abstract String roleMessage();
	
	public abstract String winCondition();
	
	public abstract String cardFlip();
	
	public abstract HashSet<String> getCommands();
	
}
