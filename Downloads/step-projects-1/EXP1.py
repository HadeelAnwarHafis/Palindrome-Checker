def is_palindrome(text):
    text = text.lower()   
    return text == text[::-1]

print("")
print("Palindrome Checker (Case Insensitive)")
print("Type 'exit' to quit\n")

while True:
    text = input("Enter a word: ")

    if text.lower() == "exit":
        print("Goodbye!")
        break

    if is_palindrome(text):
        print("✓ It is a palindrome\n")
    else:
        print("✗ Not a palindrome\n")