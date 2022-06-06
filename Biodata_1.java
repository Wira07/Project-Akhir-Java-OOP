import java.awt.Font;
import javax.swing.*;

public class Biodata_1 {
    public static void main(String[] args) {
        //container
        JFrame form = new JFrame("FORM BIODATA MAHASISWA");
        form.setSize(500, 600);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);

        //Label
        JLabel labeljudul = new JLabel("Biodata Mahasiswa");
        labeljudul.setFont(new Font("Times New Roman",0,34));
        labeljudul.setBounds(105, 30, 300, 30);
        form.add(labeljudul);
        
        //labelNIM
        JLabel labelNIM = new JLabel("NIM");
        labelNIM.setFont(new Font("Times New Roman",0,14));
        labelNIM.setBounds(50, 100, 150, 30);
        form.add(labelNIM);
        //textfield NIM
        JTextField textNIM = new JTextField();
        textNIM.setBounds(150, 100, 150, 30);
        form.add(textNIM);
        
        //labelnama
        JLabel lbnama = new JLabel("Nama");
        lbnama.setFont(new Font("Times New Roman",0,14));
        lbnama.setBounds(50, 150, 150, 30);
        form.add(lbnama);
        //textfield NIM
        JTextField textnama = new JTextField();
        textnama.setBounds(150, 150, 250, 30);
        form.add(textnama);
        
        //label Alamat
        JLabel jlalamat = new JLabel("Alamat");
        jlalamat.setFont(new Font("Times New Roman",0,14));
        jlalamat.setBounds(50, 200, 150, 30);
        form.add(jlalamat);
        JTextArea jfalamat = new JTextArea(5,1);
        JScrollPane jsp = new JScrollPane
        (jfalamat,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(150, 200, 275, 50);
        form.add(jsp);

        //labelgender
        JLabel lbgender = new JLabel("Jenis Kelamin");
        lbgender.setFont(new Font("Times New Roman",0,14));
        lbgender.setBounds(50, 300, 150, 30);
        form.add(lbgender);
        //radiobutton pria
        JRadioButton rbpria = new JRadioButton();
        rbpria.setText("Pria");
        rbpria.setBounds(150, 300, 50, 30);
        form.add(rbpria);
        //radiobutton wanita
        JRadioButton rbwanita = new JRadioButton();
        rbwanita.setText("Wanita");
        rbwanita.setBounds(250, 300, 100, 30);
        form.add(rbwanita);
        //merge
        ButtonGroup bggender = new ButtonGroup();
        bggender.add(rbpria); bggender.add(rbwanita);
        
        //label prodi
        JLabel Prodi = new JLabel("Program Studi");
        Prodi.setFont(new Font("Times New Roman",0,14));
        Prodi.setBounds(50, 350, 150, 30);
        form.add(Prodi);
        //combo box prodi
        String prodi[] = {"","D3","S1"};
        JComboBox jcprodi = new JComboBox(prodi);
        jcprodi.setBounds(150, 350, 100, 30);
        form.add(jcprodi);
        
        //label jurusan
        JLabel Jurusan = new JLabel("Jurusan");
        Jurusan.setFont(new Font("Times New Roman",0,14));
        Jurusan.setBounds(50, 400, 150, 30);
        form.add(Jurusan);
        //combo box jurusan
        String jurusan[] = {"","Manajemen Informatika",
                            "Teknik Informatika",
                            "Sistem Informatika",
                            "Desain Komunikasi Visual"};
        JComboBox jcjurusan = new JComboBox(jurusan);
        jcjurusan.setBounds(150, 400, 200, 30);
        form.add(jcjurusan);
        
        //button simpan
        JButton simpan = new JButton("Simpan");
        simpan.setBounds(50, 475, 100, 30);
        form.add(simpan);
        
        //button bacadata
        JButton bacadata = new JButton("Baca Data");
        bacadata.setBounds(185, 475, 100, 30);
        form.add(bacadata);
        
        //button Keluar
        JButton keluar = new JButton("Keluar");
        keluar.setBounds(325, 475, 100, 30);
        form.add(keluar);
        
        form.setVisible(true);
    }

}
