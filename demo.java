import java.util.*;

class demo {

 static String s[][] = {
    {" XXX  XXXX   XXXX XXXX  XXXXX XXXXX  XXXX X   X XXXXX XXXXX X   X X     X   X X   X  XXX  XXXX   XXX  XXXX   XXXX XXXXX X   X X   X X   X X   X X   X XXXXX  XXX   XX   XXXX  XXXX  X   X XXXXX  XXXX XXXXX XXXXX  XXXXX  XXX  "},
    {"X   X X   X X     X   X X     X     X     X   X   X       X X  X  X     XX XX XX  X X   X X   X X   X X   X X       X   X   X X   X X   X  X X   X X     X  X   X XXX      X     X  X   X X     X         X X   X  X   X X   X "},
    {"XXXXX XXXX  X     X   X XXXX  XXXX  X XXX XXXXX   X       X XXX   X     X X X X X X X   X XXXX  X   X XXXX   XXX    X   X   X X   X X X X   X     X     X   X   X  XX   XXXX  XXXX  XXXXX XXXX  XXXXX    X  XXXXX  XXXXX X XXX  "},
    {"X   X X   X X     X   X X     X     X   X X   X   X   X   X X  X  X     X   X X  XX X   X X     X  XX X  X      X   X   X   X  X X  XX XX  X X    X    X    X   X  XX   X        X      X     X X   X   X   X   X      X X     "},
    {"X   X XXXX   XXXX XXXX  XXXXX X      XXXX X   X XXXXX  XXX  X   X XXXXX X   X X   X  XXX  X      XXXX X   X XXXX    X    XXX    X   X   X X   X   X   XXXXX  XXX  XXXX  XXXX  XXXX      X XXXX  XXXXX  X    XXXXX  XXXXX  XXX  "},
};


  static void AllString() {
    char c[];
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter a String or a Sentence: ");
    String s1 = sc.nextLine();
    int i, j, cnt, p;
    for (i = 0; i < 5; i++) {
      for (int k = 0; k < s1.length(); k++) {
        p = Character.toUpperCase(s1.charAt(k)) - 64;
        char ch = s1.charAt(k);
        if (ch == ' ') {
          System.out.print("      ");
          continue;
        }
        cnt = 6 * (p - 1);
        c = String.valueOf(s[i][0]).toCharArray();
        for (j = cnt; j < cnt + 6; j++) {
          System.out.print(c[j]);
        }
      }
      System.out.println();
    }
  }

  static void SingleCharacter() {
    char c[];
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter a Character: ");
    String s1 = sc.next();
    if (s1.length() != 1) {
      System.out.println("\nPlease enter only one character!\n");
      return;
    }
    int i, j, cnt;
    for (i = 0; i < 5; i++) {
      for (int k = 0; k < s1.length(); k++) {
        int p = Character.toUpperCase(s1.charAt(k)) - 64;
        cnt = 6 * (p - 1);
        c = String.valueOf(s[i][0]).toCharArray();
        for (j = cnt; j < cnt + 6; j++) {
          System.out.print(c[j]);
        }
      }
      System.out.println();
    }
  }

  static void SingleWord() {
    char c[];
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter a Word: ");
    String s1 = sc.nextLine();
    int i, j, cnt, p;
    for (i = 0; i < 5; i++) {
      for (int k = 0; k < s1.length(); k++) {
        p = Character.toUpperCase(s1.charAt(k)) - 64;
        cnt = 6 * (p - 1);
        c = String.valueOf(s[i][0]).toCharArray();
        for (j = cnt; j < cnt + 6; j++) {
          System.out.print(c[j]);
        }
      }
      System.out.println();
    }
  }

  static void Range() {
    char c[];
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter a Range (e.g., A-Z): ");
    String s1 = sc.nextLine();
    for (int i = 0; i < 5; i++) {
      int start = Character.toUpperCase(s1.charAt(0)) - 64;
      int end = Character.toUpperCase(s1.charAt(2)) - 64;
      c = String.valueOf(s[i][0]).toCharArray();
      for (int j = (6 * (start - 1)); j < (6 * (end - 1) + 6); j++) {
        System.out.print(c[j]);
      }
      System.out.println();
    }
  }

  static void Numbers() {
    char c[];
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter Numbers: ");
    String s1 = sc.nextLine();
    int i, j, cnt, p;
    for (i = 0; i < 5; i++) {
      for (int k = 0; k < s1.length(); k++) {
        char ch = s1.charAt(k);
        if (Character.isDigit(ch)) {
          p = (ch - '0') + 27;
          cnt = 6 * (p - 1);
          c = String.valueOf(s[i][0]).toCharArray();
          for (j = cnt; j < cnt + 6; j++) {
            System.out.print(c[j]);
          }
        }
      }
      System.out.println();
    }
  }

  static void Mix() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter Letters, Numbers or @: ");
    String s1 = sc.nextLine();

    for (int i = 0; i < 5; i++) {
      for (int k = 0; k < s1.length(); k++) {
      char ch = s1.charAt(k);
      int p = -1;

        if (Character.isLetter(ch)) p = Character.toUpperCase(ch) - 64;
        else if (Character.isDigit(ch)) p = (ch - '0') + 27;
        else if (ch == '@') p = 37;  
        else if (ch == ' ') { System.out.print("      "); continue; }

        if (p > 0) {
          char c[] = s[i][0].toCharArray();
          for (int j = 6 * (p - 1); j < 6 * (p - 1) + 6; j++) 
          System.out.print(c[j]);
        }
        }
        System.out.println();
    }
  }


  static void MainModule() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("\n --------------------------- ASCII Pattern Project ---------------------------");
      System.out.println("1. All String ");
      System.out.println("2. Single Character ");
      System.out.println("3. Single Word ");
      System.out.println("4. Range ");
      System.out.println("5. Numbers ");
      System.out.println("6. Mix (Letters + Numbers + @)");
      System.out.print("Choose Any One Of Them: ");
      int c = sc.nextInt();
      sc.nextLine();

      if (c == 1) {
        AllString();
      } 
      else if (c == 2) {
        SingleCharacter();
      }
      else if (c == 3) {
        SingleWord();
      }
      else if (c == 4) {
        Range();
      }
      else if (c == 5) {
        Numbers();
      }
      else if (c == 6) {
        Mix();
      }
      else {
        System.out.println("Invalid Choice!");
      }

      System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
      int repeat = sc.nextInt();
      if (repeat != 1) {
        System.out.println("\nThank you! Program ended.");
        break;
      }
    }
  }

  public static void main(String args[]) {
    MainModule();
  }
}
