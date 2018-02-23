package kbc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class quiztext extends JFrame implements ActionListener {
	static int a=0,b=0,data=0,five=0,pole=0;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
	private JLabel text,line1,text2,line2,ans,score,credit;
	private JPanel pnl1,pnl2;
	String message;
	
	public quiztext() {
		super("SES");
		
		pnl1 = new JPanel();
		pnl1.setLayout(null);
		pnl1.setBounds(100,0,1300,700);
		pnl1.setBackground(Color.BLUE);
		add(pnl1);
		
		credit = new JLabel("Credit~Punkholic & Nishant");
		credit.setBounds(400,100,500,100);
		credit.setForeground(Color.RED);
		credit.setFont(new Font("Elephant",Font.BOLD,30));
		pnl1.add(credit);
		
		pnl2 = new JPanel();
		pnl2.setLayout(null);
		pnl2.setBounds(400,100,500,100);
		pnl2.setBackground(Color.CYAN);
		pnl1.add(pnl2);
		
		text = new JLabel("Who Want To Be SES'er");
		text.setBounds(300,0,700,100);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Elephant",Font.BOLD,40));
		pnl1.add(text);
		
		line1 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		line1.setBounds(0,200,2000,100);
		line1.setForeground(Color.WHITE);
		pnl1.add(line1);
		
		text2 = new JLabel();
		text2.setBounds(0,270,20000,100);
		text2.setForeground(Color.WHITE);
		text2.setFont(new Font("Elephant",Font.BOLD,30));
		pnl1.add(text2);
		
		line2 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		line2.setBounds(0,350,2000,100);
		line2.setForeground(Color.WHITE);
		pnl1.add(line2);
		
		btn1 = new JButton();
		btn1.setBackground(Color.cyan);
		btn1.setBounds(20,450,400,50);
		btn1.addActionListener(this);
		pnl1.add(btn1);
		
		btn2 = new JButton();
		btn2.setBackground(Color.cyan);
		btn2.setBounds(800,450,400,50);
		btn2.addActionListener(this);
		pnl1.add(btn2);
		
		btn3 = new JButton();
		btn3.setBackground(Color.cyan);
		btn3.setBounds(20,550,400,50);
		btn3.addActionListener(this);
		pnl1.add(btn3);
		
		btn4 = new JButton();
		btn4.setBackground(Color.cyan);
		btn4.setBounds(800,550,400,50);
		btn4.addActionListener(this);
		pnl1.add(btn4);
		
		btn5 = new JButton("Start Game!!");
		btn5.setBackground(Color.cyan);
		btn5.setBounds(400,200,200,50);
		btn5.addActionListener(this);
		pnl1.add(btn5);
		
		btn6 = new JButton("50-50");
		btn6.setBackground(Color.cyan);
		btn6.setBounds(0,90,200,50);
		btn6.addActionListener(this);
		pnl1.add(btn6);
		
		btn7 = new JButton("Audience Pole");
		btn7.setBackground(Color.cyan);
		btn7.setBounds(0,150,200,50);
		btn7.addActionListener(this);
		pnl1.add(btn7);
		
		btn8 = new JButton("Restart Game");
		btn8.setBackground(Color.cyan);
		btn8.setBounds(700,200,200,50);
		btn8.addActionListener(this);
		pnl1.add(btn8);
		
		ans = new JLabel();
		ans.setBounds(500,500,400,50);
		ans.setForeground(Color.WHITE);
		ans.setFont(new Font("Elephant",Font.BOLD,20));
		pnl1.add(ans);
		
		score = new JLabel();
		score.setBounds(1000,50,700,100);
		score.setForeground(Color.WHITE);
		score.setFont(new Font("Elephant",Font.BOLD,20));
		pnl1.add(score);
		
		
		setSize(1300,700);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	public void actionPerformed(ActionEvent niraj) {
		
		
		if(niraj.getSource()==btn8) {
			data=0;
			pole=0;
			five=0;
			btn6.setText("50-50");
			btn7.setText("Audience Pole");
			score.setText("");
			a=0;
			b=0;
			btn1.setText("");
			btn2.setText("");
			btn3.setText("");
			btn4.setText("");
			text2.setText("");
			btn5.setText("Start Game");
		}
		
		if(niraj.getSource()==btn7 && pole == 0) {
			if(a==1) {
				message = "A.)36% \n B.)21% \n C.)31% \n D.)12%";
			}else if(a==2) {
				message = "A.)43% \n B.)2% \n C.)50% \n D.)5%";
			}else if(a==3) {
				message = "A.)32% \n B.)42% \n C.)21% \n D.)5%";
			}else if(a==4) {
				message = "A.)12% \n B.)31% \n C.)21% \n D.)36%";
			}else if(a==5) {
				message = "A.)2% \n B.)50% \n C.)43% \n D.)5%";
			}else if(a==6) {
				message = "A.)32% \n B.)2% \n C.)21% \n D.)42%";
			}else if(a==7) {
				message = "A.)25% \n B.)39% \n C.)15% \n D.)21%";
			}else if(a==8) {
				message = "A.)15% \n B.)23% \n C.)41% \n D.)21%";
			}else if(a==9) {
				message = "A.)37% \n B.)13% \n C.)28% \n D.)22%";
			}else if(a==10) {
				message = "A.)9% \n B.)12% \n C.)47% \n D.)32%";
			}else if(a==11) {
				message = "A.)20% \n B.)17% \n C.)32% \n D.)31%";
			}
			JOptionPane.showMessageDialog(null, ""+message);
		
			pole++;
			if(pole==1) {
				btn7.setText("Used");
			}
		}
		
		
		
		if(niraj.getSource()==btn6 && five==0) {
			if(a==1) {
				
				btn2.setText("");
				btn3.setText("");
				
			}else if(a==2) {
				btn1.setText("");
				btn2.setText("");
			}else if(a==3) {
				btn4.setText("");
				btn1.setText("");
			}else if(a==4) {
				btn2.setText("");
				btn3.setText("");
			}else if(a==5) {
				btn1.setText("");
				btn3.setText("");
			}else if(a==6) {
				btn2.setText("");
				btn3.setText("");
			}else if(a==7) {
				btn1.setText("");
				btn3.setText("");
			}else if(a==8) {
				btn2.setText("");
				btn4.setText("");
			}else if(a==9) {
				btn2.setText("");
				btn3.setText("");
			}else if(a==10) {
				btn2.setText("");
				btn1.setText("");
			}else if(a==11) {
				btn2.setText("");
				btn1.setText("");
			}
			five++;
			if(five==1) {
				btn6.setText("Used");
			}
		}
		
		
		if(niraj.getSource()==btn1) {
			if(b==1) {
				ans.setText("You Are Right!!");
				score.setText("Score:"+a);
				data=1;
			}else if( b==9 ) {
				data=9;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}
			else {
				a=12;
				b=12;
				text2.setText("You Loose");
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("You Loose");
				ans.setText("You Loose");
			}
		}
		
		else if(niraj.getSource()==btn2) {
			if(b==3) {
				data=3;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}else if( b==5 ) {
				data=5;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}else if(b==7) {
				data=7;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}
			
			else {
				a=12;
				b=12;
				text2.setText("You Loose");
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("You Loose");
				ans.setText("You Loose");
			}
		}
		else if(niraj.getSource()==btn3) {
			if(b==2) {
				data=2;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}else if( b==8 ) {
				data=8;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}else if(b==10) {
				data=10;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}else if(b==11) {
				data=11;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}
			else {
				a=12;
				b=12;
				text2.setText("You Loose");
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("You Loose");
				ans.setText("You Loose");
			}
		}
		
		else if(niraj.getSource()==btn4) {
			if(b==4) {
				data=4;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}else if(b==6) {
				data=6;
				score.setText("Score:"+a);
				ans.setText("You Are Right!!");
			}
			else {
				a=12;
				b=12;
				text2.setText("You Loose");
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("You Loose");
				ans.setText("You Loose");
			
		}
		
		}
		
		if(niraj.getSource()==btn5) {
			if(a==0) {
				ans.setText("");
				text2.setText("Which is the place known as door of nepal?");
				btn1.setText("A.)Birgunj");
				btn2.setText("B.)Lahan");
				btn3.setText("C.)Nepalgunj");
				btn4.setText("D.)Kakarvitta");
				btn5.setText("Next Question");
				a++;
				b++;	
			}else if(a==1 && data==1) {
				ans.setText("");
				text2.setText("Where is the tallest bridge of Nepal?");
				btn1.setText("A.)Tikauii, Chitwan");
				btn2.setText("B.)Girvan Yuddha Bikram,Nuwakot");
				btn3.setText("C.)Modikhola, Parvat");
				btn4.setText("D.)Non Of The Above");
				a++;
				b++;	
			}else if(a==2 && data==2) {
				ans.setText("");
				text2.setText("How many places of Nepal have been declared wetlands (simsar) now?");
				btn1.setText("A.)4");
				btn2.setText("B.)9");
				btn3.setText("C.)3");
				btn4.setText("D.)7");
				a++;
				b++;	
			}else if(a==3 && data==3) {
				text2.setText("Where is the Biodiversity Information established?");
				btn1.setText("A.)Biratnagar,Morang");
				btn2.setText("B.)Girvan Yuddha Bikram,Nuwakot");
				btn3.setText("C.)Modikhola, Parvat");
				btn4.setText("D.)Tikauii, Chitwan");
				a++;
				b++;	
			}else if(a==4 && data==4) {
				ans.setText("");
				text2.setText("Which City Was Known As 'the City of Devotees?");
				btn1.setText("A.)Antu Danda");
				btn2.setText("B.)Bhaktapur");
				btn3.setText("C.)Pokhara");
				btn4.setText("D.)Dhorpatan");
				a++;
				b++;	
			}else if(a==5 && data==5) {
				ans.setText("");
				text2.setText("When did Tul Bahadur Pun, a Victoria Cross winner, pass away?");
				btn1.setText("A.)14 Ashar, 2071 ");
				btn2.setText("B.)7 Bhadra , 2065");
				btn3.setText("C.)17 Kartik , 2054");
				btn4.setText("D.)7 Baishakh, 2068 ");
				a++;
				b++;	
			}else if(a==6 && data==6) {
				ans.setText("");
				text2.setText("Where is the Martyr and Civil Park going to be constructed?");
				btn1.setText("A.)Hathimudha,Morang");
				btn2.setText("B.)Jagadol, Gokarna");
				btn3.setText("C.)Udayapur,Sagarmatha");
				btn4.setText("D.)Badahare,Khotang");
				a++;
				b++;	
			}else if(a==7 && data==7) {
				text2.setText("Which is the conservation area first established in Nepal?");
				btn1.setText("A.)Bardia National Park");
				btn2.setText("B.)Sagarmatha National Park");
				btn3.setText("C.)Annapurna Conservation Area");
				btn4.setText("D.)Shuklaphanta Wildlife Reserve");
				a++;
				b++;	
			}else if(a==8 && data==8) {
				ans.setText("");
				text2.setText("When was the Amali system eradicated?");
				btn1.setText("A.)1968 BS");
				btn2.setText("B.)1924 BS");
				btn3.setText("C.)1985 BS");
				btn4.setText("D.)1954 BS");
				a++;
				b++;	
			}else if(a==9 && data==9) {
				ans.setText("");
				text2.setText("From which Veda did music originate?");
				btn1.setText("A.)Yajur ved");
				btn2.setText("B.)Rig ved");
				btn3.setText("C.)Sama Ved");
				btn4.setText("D.)Atharva ved");
				a++;
				b++;
					
			}else if(a==10 && data==10) {
				text2.setText("Into how many categories is the land classified on the basis of productivity?");
				btn1.setText("A.)3");
				btn2.setText("B.)6");
				btn3.setText("C.)4");
				btn4.setText("D.)7");
				a++;
				b++;
			}else if(a>10 && data==11) {
				ans.setText("");
				text2.setText("You Have Completed our Questions");
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				a++;
				b++;
			}else {
				ans.setText("Answer This Question");
			}
			
			
		}
		

		
		
	}

	public static void main(String arg[]) {
		new quiztext();
	}
	
}
