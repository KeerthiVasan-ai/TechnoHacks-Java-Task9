package Password_Generator;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class MainActivity extends javax.swing.JFrame {
    
    List<String> UPPERCASE;
    List<String> LOWERCASE;
    List<String> NUMBERS;
    List<String> SPLCHARACTERS;

    List<String> MERGEDLIST;

    public MainActivity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        uppercase = new javax.swing.JCheckBox();
        lowercase = new javax.swing.JCheckBox();
        numbers = new javax.swing.JCheckBox();
        splcharacter = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lengthVariable = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resultText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator");

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Lato Semibold", 1, 20)); // NOI18N
        jLabel1.setText("Password Generator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Password Should Contain"));

        uppercase.setText("String (UPPERCASE)");

        lowercase.setText("String (lowercase)");

        numbers.setText("Numbers");

        splcharacter.setText("Special  Characters");

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Number of Characters");

        lengthVariable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel4.setText("Password:");

        resultText.setText("TO BE GENERATED");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(splcharacter)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lengthVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lowercase)
                    .addComponent(numbers)
                    .addComponent(uppercase))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultText)
                        .addGap(12, 12, 12))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(uppercase)
                .addGap(18, 18, 18)
                .addComponent(lowercase)
                .addGap(20, 20, 20)
                .addComponent(numbers)
                .addGap(19, 19, 19)
                .addComponent(splcharacter)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lengthVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(resultText))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        UPPERCASE = generateUpperCase();
        LOWERCASE = generateLowerCase();
        NUMBERS = generateNumber();
        SPLCHARACTERS = generateSplCharacters();
        
        String pwdLength = (String) lengthVariable.getSelectedItem();
        
        MERGEDLIST = new ArrayList<>();
       
       if(!"Select".equals(pwdLength)){ 
           
            if(uppercase.isSelected()){
                MERGEDLIST = mergeList(MERGEDLIST,UPPERCASE);
            }

            if (lowercase.isSelected()){
                MERGEDLIST = mergeList(MERGEDLIST,LOWERCASE);
            }

            if (numbers.isSelected()){
                MERGEDLIST = mergeList(MERGEDLIST,NUMBERS);
            }
            if(splcharacter.isSelected()){
                MERGEDLIST = mergeList(MERGEDLIST,SPLCHARACTERS);
            }
            
            String pwd = generatePassword(MERGEDLIST,pwdLength);
            JOptionPane.showMessageDialog(this,  "Password Generated Succesfully");
            resultText.setText(pwd);

       } else {
           JOptionPane.showMessageDialog(this,"Choose The Correct Length");
       }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    public static List<String> generateUpperCase(){
        List<String> UPPERCASE = new ArrayList<>();
        
        for (char letter='A';letter<='Z';letter++){
            UPPERCASE.add(Character.toString(letter));
        }
        
        return UPPERCASE;
    }
    
    public static List<String> generateLowerCase(){
        List<String> LOWERCASE = new ArrayList<>();
        
        for (char letter='a';letter<='z';letter++){
            LOWERCASE.add(Character.toString(letter));
        }
        
        return LOWERCASE;
    }
    
    public static List<String> generateNumber(){
        List<String> NUMBERS = new ArrayList<>();
        
        for (int number = 0;number <= 9;number++){
            NUMBERS.add(Integer.toString(number));
        }
        
        return NUMBERS;
    }
    
    public static List<String> generateSplCharacters(){
        List<String> SplCharacter = new ArrayList<>();
        for (int i=33;i<=126;i++){
            char spl = (char)i;
            if(!Character.isLetterOrDigit(spl)){
                SplCharacter.add(Character.toString(spl));
            }
        }
        return SplCharacter;
    }
    
    public static List<String> mergeList(List<String> list1 , List<String> list2){
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
    
    public static String generatePassword(List<String> list1,String length) {
        List<String> randomPassword = new ArrayList<>();
        Random random = new Random();
        
        int listSize = list1.size();
        
        for(int i=0;i< Integer.parseInt(length);i++){
            int randomIndex = random.nextInt(listSize);
            String randomValue = list1.get(randomIndex);
            randomPassword.add(randomValue);
            listSize--;
            list1.remove(randomIndex);
        }
        
        StringBuilder finalPassword = new StringBuilder();
        
        for (String element : randomPassword){
            finalPassword.append(element);
        }
        return finalPassword.toString();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> lengthVariable;
    private javax.swing.JCheckBox lowercase;
    private javax.swing.JCheckBox numbers;
    private javax.swing.JLabel resultText;
    private javax.swing.JCheckBox splcharacter;
    private javax.swing.JCheckBox uppercase;
    // End of variables declaration//GEN-END:variables
}
