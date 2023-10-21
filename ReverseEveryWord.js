function reverseWords(sentence) {
  // Split the sentence into an array of words
  var words = sentence.split(" ");
  
  // Reverse each word individually
  for (var i = 0; i < words.length; i++) {
    words[i] = words[i].split("").reverse().join("");
  }
  
  // Join the reversed words back into a sentence
  var reversedSentence = words.join(" ");
  
  // Return the reversed sentence
  return reversedSentence;
}

// Example usage
var input = "This is a sunny day";
var reversedInput = reverseWords(input);
console.log(reversedInput);