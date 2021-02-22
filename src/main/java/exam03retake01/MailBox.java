package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String criteria) {
        String[] fields = criteria.split(":");
        List<Mail> result = new ArrayList<>();

        if (fields[0].equals("from")) {
            for (Mail m: mails ) {
                if (fields[1].equals(m.getFrom().getEmail())) {
                    result.add(m);
                }
            }
        }

        if (fields[0].equals("to")) {
            for (Mail m: mails ) {

                for (int i = 0; i<m.getTo().size(); i++) {
                    if (m.getTo().get(i).getName().equals(fields[1])) {
                        result.add(m);
                    }
                }

            }
        } else {

            for (Mail m: mails ) {
                if (fields[0].equals(m.getSubject())) {
                    result.add(m);
                }
            }

        }

        return result;
    }


}
