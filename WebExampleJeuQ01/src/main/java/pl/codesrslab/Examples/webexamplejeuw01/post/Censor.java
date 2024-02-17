package pl.codesrslab.Examples.webexamplejeuw01.post;

public class Censor {


    private static String[] DISALLOWED_PHARSES = {
            "kurde", "motyla noga", "cholera"
    };

    public static String doCensor(String toBeCensored) {
        String result = toBeCensored;
        for (String pharse : DISALLOWED_PHARSES) {

            result = result.replaceAll(pharse, "*".repeat(pharse.length()));
        }
        return "censored: " + result;
    }
}
