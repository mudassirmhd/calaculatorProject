import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

  boolean isOperatorClicked=false,add=false,sub=false,multiply=false,divide=false;
  
  JFrame jf;
  
  JLabel displayLabel;

  String oldValue,newValue,minValue,mulValue,divValue;

  
  JButton       sevenButton,eightButton,plusButton,clearButton,minusButton,mulButton,nineButton,fourButton,
fiveButton,sixButton,oneButton,twoButton,threeButton,dotButton,zeroButton,equalsButton,divButton;
   
  
  public Calculator(){
    jf=new JFrame();
    jf.setLayout(null);
    jf.setSize(600,800);


    displayLabel=new JLabel();
    displayLabel.setBounds(30,50,540,40);
    displayLabel.setBackground(Color.gray);
    displayLabel.setOpaque(true);
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displayLabel.setForeground(Color.white);
    jf.add(displayLabel);

    sevenButton=new JButton("7");
    sevenButton.setBounds(30,130,80,80);
    jf.add(sevenButton);
    sevenButton.addActionListener(this);
    
    eightButton=new JButton("8");
    eightButton.setBounds(130,130,80,80);
    jf.add(eightButton);
    eightButton.addActionListener(this);
    
    nineButton=new JButton("9");
    nineButton.setBounds(230,130,80,80);
    jf.add(nineButton);
    nineButton.addActionListener(this);

    fourButton=new JButton("4");
    fourButton.setBounds(30,230,80,80);
    jf.add(fourButton);
    fourButton.addActionListener(this);
    
    fiveButton=new JButton("5");
    fiveButton.setBounds(130,230,80,80);
    jf.add(fiveButton);
    fiveButton.addActionListener(this);
    
    sixButton=new JButton("6");
    sixButton.setBounds(230,230,80,80);
    jf.add(sixButton);
    sixButton.addActionListener(this);
    
    oneButton=new JButton("1");
    oneButton.setBounds(30,330,80,80);
    jf.add(oneButton);
    oneButton.addActionListener(this);
    
    twoButton=new JButton("2");
    twoButton.setBounds(130,330,80,80);
    jf.add(twoButton);
    twoButton.addActionListener(this);
    
    threeButton=new JButton("3");
    threeButton.setBounds(230,330,80,80);
    jf.add(threeButton);
    threeButton.addActionListener(this);

    dotButton=new JButton(".");
    dotButton.setBounds(30,430,80,80);
    jf.add(dotButton);
    dotButton.addActionListener(this);
    
    zeroButton=new JButton("0");
    zeroButton.setBounds(130,430,80,80);
    jf.add(zeroButton);
    zeroButton.addActionListener(this);
    
    equalsButton=new JButton("=");
    equalsButton.setBounds(230,430,80,80);
    jf.add(equalsButton);
    equalsButton.addActionListener(this);

    divButton=new JButton("/");
    divButton.setBounds(330,130,80,80);
    jf.add(divButton);
    divButton.addActionListener(this);

    mulButton=new JButton("x");
    mulButton.setBounds(330,230,80,80);
    jf.add(mulButton);
    mulButton.addActionListener(this);

    minusButton=new JButton("-");
    minusButton.setBounds(330,330,80,80);
    jf.add(minusButton);
    minusButton.addActionListener(this);

    plusButton=new JButton("+");
    plusButton.setBounds(330,430,80,80);
    jf.add(plusButton);
    plusButton.addActionListener(this);

    clearButton=new JButton("Clear");
    clearButton.setBounds(430,430,80,80);
    jf.add(clearButton);
    clearButton.addActionListener(this);

    
    jf.setVisible(true);
    //jf.setDefaultCloseOperationtion(JFrame.EXIT_ON_CLOSE);

    
  }

  public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==sevenButton){

      if(isOperatorClicked){
        displayLabel.setText("7");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"7");
      }
      
    }else if(e.getSource()==eightButton){
      if(isOperatorClicked){
        displayLabel.setText("8");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"8");
      }
      
    }else if(e.getSource()==nineButton){
      if(isOperatorClicked){
        displayLabel.setText("9");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"9");
      }
      
    }else if(e.getSource()==fourButton){
      if(isOperatorClicked){
        displayLabel.setText("4");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"4");
      }
      
    }else if(e.getSource()==fiveButton){
      if(isOperatorClicked){
        displayLabel.setText("5");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"5");
      }
      
    }else if(e.getSource()==sixButton){
      if(isOperatorClicked){
        displayLabel.setText("6");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"6");
      }
      
    }else if(e.getSource()==oneButton){
      if(isOperatorClicked){
        displayLabel.setText("1");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"1");
      }
      
    }else if(e.getSource()==twoButton){
      if(isOperatorClicked){
        displayLabel.setText("2");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"2");
      }
      
    }else if(e.getSource()==threeButton){
      if(isOperatorClicked){
        displayLabel.setText("3");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"3");
      }
      
    }else if(e.getSource()==zeroButton){
      if(isOperatorClicked){
        displayLabel.setText("0");
        isOperatorClicked=false;
      }else{
        displayLabel.setText(displayLabel.getText()+"0");
      }
      
    }else if(e.getSource()==dotButton){
      displayLabel.setText(displayLabel.getText()+".");
    }else if(e.getSource()==plusButton){

        isOperatorClicked=true;
        oldValue=displayLabel.getText();
        add=true;
      
    }else if(e.getSource()==minusButton){

        isOperatorClicked=true;
        oldValue=displayLabel.getText();
        sub=true;
      
    }else if(e.getSource()==mulButton){

        isOperatorClicked=true;
        oldValue=displayLabel.getText();
        multiply=true;
      
    }else if(e.getSource()==divButton){

        isOperatorClicked=true;
        oldValue=displayLabel.getText();
        divide=true;
      
    }else if(e.getSource()==equalsButton){
        
        newValue=displayLabel.getText();
        float result=0;
      
        float oldValueF=Float.parseFloat(oldValue);
        float newValueF=Float.parseFloat(newValue);
        if(add){
           result=oldValueF+newValueF;
          displayLabel.setText(result+"");
        }else if(sub){
          result=oldValueF-newValueF;
          displayLabel.setText(result+"");
        }else if(multiply){
          result=oldValueF*newValueF;
          displayLabel.setText(result+"");
        }else if(divide){
          result=oldValueF/newValueF;
          displayLabel.setText(result+"");

          add=false;
          sub=false;
          multiply=false;
          divide=false;
        }
    }else if(e.getSource()==clearButton){
      displayLabel.setText("");
    }
  }
}