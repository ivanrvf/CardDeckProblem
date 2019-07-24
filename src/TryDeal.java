class TryDeal {
public static void main(String[] args) {
CardDeck deck = new CardDeck();
deck.shuffle();
Hand myHand = deck.dealHand(13).sort();
Hand yourHand = deck.dealHand(13).sort();
Hand your2Hand = deck.dealHand(13).sort();
Hand your3Hand = deck.dealHand(13).sort();
System.out.println("\nMy hand is:\n" + myHand);
System.out.println("\nYour hand is:\n" + yourHand);
System.out.println("\nYour hand is:\n" + your2Hand);
System.out.println("\nYour hand is:\n" + your3Hand);
}
}