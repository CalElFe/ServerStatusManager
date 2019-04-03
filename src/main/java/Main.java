import xyz.ttnaarashi.mc.ssm.message.MarkdownConstructor;

public class Main {
    public static void main(String[] args) {
        MarkdownConstructor constructor = new MarkdownConstructor();
        constructor
                .addTitle(1,
                        new MarkdownConstructor()
                                .addStr("TEST", false, false, false)
                )
                .addTitle(2,
                        new MarkdownConstructor()
                                .addStr("line2", true, true, false)
                )
                .addStr("line3", false, false, true)
                .addHLine(3)
                .addCode("Python",
                        "myList = []\n" +
                              "for i in range(0, 6, 2):\n" +
                              "    for k in range(4):\n" +
                              "        myList.append(i + k)\n" +
                              "        \n" +
                              "print(i)\n" +
                              "print(k)\n" +
                              "print(myList)")
                .addStr("This is awesome!", true, true, true);
        System.out.println(constructor);
    }
}
