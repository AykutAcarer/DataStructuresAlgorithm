package DataStructures;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		
		//System.out.println(stack.empty());
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Bprderlands");
		stack.push("FFVI");
		
		System.out.println(stack);	//Output : [Minecraft, Skyrim, DOOM, Bprderlands, FFVI]
		
		stack.pop();
		
		System.out.println(stack); //Output: [Minecraft, Skyrim, DOOM, Bprderlands]
		
		stack.pop();
		
		System.out.println(stack); //Output: [Minecraft, Skyrim, DOOM]
		
		String myGame = stack.pop();
		System.out.println(myGame);  //Output: DOOM
		
		System.out.println(stack); //Output: [Minecraft, Skyrim]
		
		System.out.println(stack.peek()); //Output: Skyrim
		
		System.out.println(stack); //Output: [Minecraft, Skyrim]
		
		System.out.println(stack.search("Minecraft")); //Output:2
		System.out.println(stack.search("DOOM")); //Output: -1
		
	}

}
