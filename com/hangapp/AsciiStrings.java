package com.hangapp;

public class AsciiStrings{
  public void mainMenu(){
    String logo =
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
     "            2. Difficulty                                    g::::::ggg:::::::g            |      @       Miki\n" +
     "            3. Help/How to play                                gg:::::::::::::g            |     /|\\      Kristóf\n" +
     "            4. Quit                                              ggg::::::gggg             |      |       Taki\n" +
     "                                                                    gggggg                 |     / \\\n" +
     "                                                                                        ___|___\n\n");

    System.out.print("\033\143");
    System.out.println(logo);
  }
}
