package ConsoleTester;


public class IOFactory
{
    public static ConsoleIO getConsoleIO()
    {
        ConsoleIO cIO = new MyConsole();
        return cIO;

    }
}
