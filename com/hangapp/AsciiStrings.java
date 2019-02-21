package com.hangapp;

  /** Hangman logo for main menu and the in-game version.*/
public class AsciiStrings{
  public void mainMenu(int opt){
    String[] menu = new String[2];
    menu[0] =
            ("\n" +
                    "  HHHHHHHHH     HHHHHHHHH\n" +
                    "  H:::::::H     H:::::::H\n" +
                    "  H:::::::H     H:::::::H\n" +
                    "  HH::::::H     H::::::HH\n" +
                    "    H:::::H     H:::::H    aaaaaaaaaaaaa  nnnn  nnnnnnnn       ggggggggg   ggggg   mmmmmmm    mmmmmmm     aaaaaaaaaaaaa  nnnn  nnnnnnnn\n" +
                    "    H:::::H     H:::::H    a::::::::::::a n:::nn::::::::nn    g:::::::::ggg::::g mm:::::::m  m:::::::mm   a::::::::::::a n:::nn::::::::nn\n" +
                    "    H::::::HHHHH::::::H    aaaaaaaaa:::::an::::::::::::::nn  g:::::::::::::::::gm::::::::::mm::::::::::m  aaaaaaaaa:::::an::::::::::::::nn\n" +
                    "    H:::::::::::::::::H             a::::ann:::::::::::::::ng::::::ggggg::::::ggm::::::::::::::::::::::m           a::::ann:::::::::::::::n\n" +
                    "    H:::::::::::::::::H      aaaaaaa:::::a  n:::::nnnn:::::ng:::::g     g:::::g m:::::mmm::::::mmm:::::m    aaaaaaa:::::a  n:::::nnnn:::::n\n" +
                    "    H::::::HHHHH::::::H    aa::::::::::::a  n::::n    n::::ng:::::g     g:::::g m::::m   m::::m   m::::m  aa::::::::::::a  n::::n    n::::n\n" +
                    "    H:::::H     H:::::H   a::::aaaa::::::a  n::::n    n::::ng:::::g     g:::::g m::::m   m::::m   m::::m a::::aaaa::::::a  n::::n    n::::n\n" +
                    "    H:::::H     H:::::H  a::::a    a:::::a  n::::n    n::::ng::::::g    g:::::g m::::m   m::::m   m::::ma::::a    a:::::a  n::::n    n::::n\n" +
                    "  HH::::::H     H::::::HHa::::a    a:::::a  n::::n    n::::ng:::::::ggggg:::::g m::::m   m::::m   m::::ma::::a    a:::::a  n::::n    n::::n\n" +
                    "  H:::::::H     H:::::::Ha:::::aaaa::::::a  n::::n    n::::n g::::::::::::::::g m::::m   m::::m   m::::ma:::::aaaa::::::a  n::::n    n::::n\n" +
                    "  H:::::::H     H:::::::H a::::::::::aa:::a n::::n    n::::n  gg::::::::::::::g m::::m   m::::m   m::::m a::::::::::aa:::a n::::n    n::::n\n" +
                    "  HHHHHHHHH     HHHHHHHHH  aaaaaaaaaa  aaaa nnnnnn    nnnnnn    gggggggg::::::g mmmmmm   mmmmmm   mmmmmm  aaaaaaaaaa  aaaa nnnnnn    nnnnnn\n" +
                    "                                                                        g:::::g\n" +
                    "                                                            gggggg      g:::::g             ______\n" +
                    "            1. New game                                     g:::::gg   gg:::::g            |/     |      Created by:\n" +
                    "            2. Quit                                          g::::::ggg:::::::g            |      @       Miki\n" +
                    "                                                               gg:::::::::::::g            |     /|\\      Kristóf\n" +
                    "                                                                 ggg::::::gggg             |      |       Taki\n" +
                    "                                                                    gggggg                 |     / \\\n" +
                    "                                                                                        ___|___\n\n");
    menu[1] =
            ("\n" +
                    "  HHHHHHHHH     HHHHHHHHH\n" +
                    "  H:::::::H     H:::::::H\n" +
                    "  H:::::::H     H:::::::H\n" +
                    "  HH::::::H     H::::::HH\n" +
                    "    H:::::H     H:::::H    aaaaaaaaaaaaa  nnnn  nnnnnnnn       ggggggggg   ggggg   mmmmmmm    mmmmmmm     aaaaaaaaaaaaa  nnnn  nnnnnnnn\n" +
                    "    H:::::H     H:::::H    a::::::::::::a n:::nn::::::::nn    g:::::::::ggg::::g mm:::::::m  m:::::::mm   a::::::::::::a n:::nn::::::::nn\n" +
                    "    H::::::HHHHH::::::H    aaaaaaaaa:::::an::::::::::::::nn  g:::::::::::::::::gm::::::::::mm::::::::::m  aaaaaaaaa:::::an::::::::::::::nn\n" +
                    "    H:::::::::::::::::H             a::::ann:::::::::::::::ng::::::ggggg::::::ggm::::::::::::::::::::::m           a::::ann:::::::::::::::n\n" +
                    "    H:::::::::::::::::H      aaaaaaa:::::a  n:::::nnnn:::::ng:::::g     g:::::g m:::::mmm::::::mmm:::::m    aaaaaaa:::::a  n:::::nnnn:::::n\n" +
                    "    H::::::HHHHH::::::H    aa::::::::::::a  n::::n    n::::ng:::::g     g:::::g m::::m   m::::m   m::::m  aa::::::::::::a  n::::n    n::::n\n" +
                    "    H:::::H     H:::::H   a::::aaaa::::::a  n::::n    n::::ng:::::g     g:::::g m::::m   m::::m   m::::m a::::aaaa::::::a  n::::n    n::::n\n" +
                    "    H:::::H     H:::::H  a::::a    a:::::a  n::::n    n::::ng::::::g    g:::::g m::::m   m::::m   m::::ma::::a    a:::::a  n::::n    n::::n\n" +
                    "  HH::::::H     H::::::HHa::::a    a:::::a  n::::n    n::::ng:::::::ggggg:::::g m::::m   m::::m   m::::ma::::a    a:::::a  n::::n    n::::n\n" +
                    "  H:::::::H     H:::::::Ha:::::aaaa::::::a  n::::n    n::::n g::::::::::::::::g m::::m   m::::m   m::::ma:::::aaaa::::::a  n::::n    n::::n\n" +
                    "  H:::::::H     H:::::::H a::::::::::aa:::a n::::n    n::::n  gg::::::::::::::g m::::m   m::::m   m::::m a::::::::::aa:::a n::::n    n::::n\n" +
                    "  HHHHHHHHH     HHHHHHHHH  aaaaaaaaaa  aaaa nnnnnn    nnnnnn    gggggggg::::::g mmmmmm   mmmmmm   mmmmmm  aaaaaaaaaa  aaaa nnnnnn    nnnnnn\n" +
                    "                                                                        g:::::g\n" +
                    "                                                            gggggg      g:::::g             ______\n" +
                    "                                                            g:::::gg   gg:::::g            |/     |      Created by:\n" +
                    "                                                             g::::::ggg:::::::g            |      @       Miki\n" +
                    "                                                               gg:::::::::::::g            |     /|\\      Kristóf\n" +
                    "                                                                 ggg::::::gggg             |      |       Taki\n" +
                    "                                                                    gggggg                 |     / \\\n" +
                    "                                                                                        ___|___\n\n");

    System.out.print("\033\143");
    System.out.println(menu[opt]);
  }
  /** ASCII characters for hanged up man*/
  public void hangedMan(int opt){
    String[] mans = new String[8];
    mans[0] = "   +---+\n" +
            "   |   |\n" +
            "   @   |\n" +
            "  /|\\  |\n" +
            "   |   |\n" +
            "  / \\  |\n" +
            "       |\n" +
            " =========\n";
    mans[1] = "   +---+\n" +
            "   |   |\n" +
            "   @   |\n" +
            "  /|\\  |\n" +
            "   |   |\n" +
            "    \\  |\n" +
            "       |\n" +
            " =========\n";
    mans[2] = "   +---+\n" +
            "   |   |\n" +
            "   @   |\n" +
            "  /|\\  |\n" +
            "   |   |\n" +
            "       |\n" +
            "       |\n" +
            " =========\n";
    mans[3] = "   +---+\n" +
            "   |   |\n" +
            "   @   |\n" +
            "  /|   |\n" +
            "   |   |\n" +
            "       |\n" +
            "       |\n" +
            " =========\n";
    mans[4] = "   +---+\n" +
            "   |   |\n" +
            "   @   |\n" +
            "   |   |\n" +
            "   |   |\n" +
            "       |\n" +
            "       |\n" +
            " =========\n";
    mans[5] = "   +---+\n" +
            "   |   |\n" +
            "   @   |\n" +
            "       |\n" +
            "       |\n" +
            "       |\n" +
            "       |\n" +
            " =========\n";
    mans[6] = "   +---+\n" +
            "       |\n" +
            "       |\n" +
            "       |\n" +
            "       |\n" +
            "       |\n" +
            "       |\n" +
            " =========\n";
    mans[7] = "\n\n\n\n\n\n\n" +
            " =========\n";
    System.out.println(mans[opt]);
  }
}
