package lesson12;

public class Url {
    public static String getServerName(String url) {
        String baseString = "://";
        int startIndex = baseString.length() + url.indexOf(baseString);
        int endIndex = url.indexOf("/", startIndex);

        if (endIndex == -1) {
            return url.substring(startIndex);
        }

        return url.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String url = "https://ServerName/abcd/dfdf.htm?dfdf=dfdf";

        String serverName = getServerName(url);
        System.out.print("Имя сервера из URL адреса: " + serverName);
    }
}