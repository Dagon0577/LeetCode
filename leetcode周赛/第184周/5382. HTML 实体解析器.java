class Solution {
    public String entityParser(String text) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '&') {
                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(j) == ';') {
                        String tmp = text.substring(i, j + 1);
                        if (tmp.equals("&quot;")) {
                            res.append("\"");
                        } else if (tmp.equals("&apos;")) {
                            res.append("'");
                        } else if (tmp.equals("&amp;")) {
                            res.append("&");
                        } else if (tmp.equals("&gt;")) {
                            res.append(">");
                        } else if (tmp.equals("&lt;")) {
                            res.append("<");
                        } else if (tmp.equals("&frasl;")) {
                            res.append("/");
                        } else {
                            res.append(tmp);
                        }
                        i = j;
                        break;
                    }
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}