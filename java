import java.util .*;

public class MostFrequentCharacter {
AAAA
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input
int N = sc.nextInt();
String S = sc.next();

// Step 1: Frequency array for 26 lowercase letters
int[] freq = new int[26];
for (char ch : S.tocharArray()) {
freq[ch - 'a']++;

// Step 2: Find max frequency and lexicographically smallest character
int maxFreq = 0;
char answer = 'a';
for (int i = 0; i < 26; i++) {
if (freq[i] > maxFreq) {
maxFreq = freq[i];
answer = (char) (i + 'a');
} else if (freq[i] == maxFreq && freq[i] > ø) {
char candidate = (char) (i + 'a');
if (candidate < answer) {
answer = candidate;

// Output
System.out.println(answer);

}

}
