// https://leetcode.com/problems/unique-email-addresses

class Solution {
    Set<String> emailsSet = new HashSet<>();

    public int numUniqueEmails(String[] emails) {
        for (int i = 0; i < emails.length; i++) {helper(emails[i]);
        }
        return emailsSet.size();
    }

    private void helper(String s) {

        StringBuilder localName = new StringBuilder();
        StringBuilder domain = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                domain = new StringBuilder(s.substring(i, s.length()));
                break;
            } else {
                localName.append(s.charAt(i));
            }
        }

        localName = new StringBuilder(localName.toString().replaceAll("\\.", ""));
        for (int j = 0; j < localName.length(); j++) {
            if (localName.charAt(j) == '+') {
                localName = localName.delete(j, localName.length());
            }
        }
       emailsSet.add(localName.toString() + domain.toString());

    }
}