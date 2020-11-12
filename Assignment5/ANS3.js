var brackets_validator = (input_string) => { 
	
	let stack = [];
	for(let i=0;i<input_string.length;i++) {

		if(input_string[i]==='{') {
			stack.push('{');
		}

		else if(input_string[i]==='(') {
			stack.push('(');
		}

		else if(input_string[i]==='[') {
			stack.push('[');
		}
		
		else if(input_string[i]==='}' || input_string[i]===']' || input_string[i]===')') {

			if(stack.length==0) {
				console.log("Input tring not properly nested.");
				return false;
			}
		
			var top = stack.pop();
			var element;
		
			if(top ==='{') {
				element='}';
			}
		
			else if(top === '[') {
				element=']';
			}
		
			else {
				element=')';
			}
		
			if(element != input_string[i]) {
				console.log("Input tring not properly nested.");
				return false;
			}
		}
	}

	if(stack.length != 0) {
		console.log("Input tring not properly nested.");
		return false;
	}
	console.log("Input string properly nested.");
	return true;
}