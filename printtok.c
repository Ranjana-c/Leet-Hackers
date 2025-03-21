#include <stdio.h>
#include <string.h>

int main() {
    char sentence[1000]; // To store the input sentence
    
    // Step 1: Read the input sentence
    fgets(sentence, sizeof(sentence), stdin); // Read the entire line including spaces

    // Step 2: Remove the newline character if it's at the end of the input
    sentence[strcspn(sentence, "\n")] = '\0';
    
    // Step 3: Tokenize the sentence using space as the delimiter
    char *word = strtok(sentence, " "); // Split the sentence into words based on space
    
    // Step 4: Print each word on a new line
    while (word != NULL) {
        printf("%s\n", word); // Print the word followed by a newline
        word = strtok(NULL, " "); // Get the next word
    }

    return 0;
}
