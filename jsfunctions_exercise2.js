
var hands_array = ["rock", "paper", "scissors"];
var player1Wins = 0;
var player2Wins = 0;

var player1 = {
	name: "Michelle",
	getHand: function() {
		var random = parseInt(Math.random()*10)%3;
		return hands_array[random];
	}
}

var player2 = {
	name: "Levi",
	getHand: function() {
		var random = parseInt(Math.random()*10)%3;
		return hands_array[random];
	}
}

function playRound(play1, play2) {
	if (play1.getHand() === play2.getHand()) {
		console.log("It's a tie!");
	} else if (
		(play1.getHand() === "rock" && play2.getHand() === "scissors") ||
		(play1.getHand() === "paper" && play2.getHand() === "rock") ||
		(play1.getHand() === "scissors" && play2.getHand() === "paper")
		) 
	{
		console.log(play1.name + " gets " + play1.getHand() + ". " + play2.name + " gets " + play2.getHand() + ". " + player1.name + " wins the round!");
		player1Wins += 1;
		
	} else {
		console.log(play2.name + " gets " + play2.getHand() + ". " + play1.name + " gets " + play1.getHand() + ". " + player2.name + " wins the round!");
		player2Wins += 1;
		
	}
}

function playGame(play1, play2, playUntil) {
	while ( player1Wins < playUntil && player2Wins < playUntil ) {
		playRound(play1, play2);
	};
}


playGame(player1, player2, 5); 

if ( player1Wins === 5 ) {
	console.log(player1.name + ", You win!");
} else {
	console.log(player2.name + ", You win!");
}