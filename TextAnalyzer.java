/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;

/**
 *
 * @author HP
 */
public class TextAnalyzer {
    private int length;
    private int words;
    private int tab;
    private int space;
    private int lines;
    
    private TextAnalyzer(int length,int words,int tabs,int space,int lines){
        this.length=length;
        this.words=words;
        this.tab=tab;
        this.space=space;
        this.lines=lines;
    }
    public int getlength(){
        return length;
    }
    public void setlength(int length){
        this.length=length;
    }
    public int getwords(){
        return words;
    }
    public void setwords(int word){
        this.words=words;
    }
    public int gettab(){
        return tab;
    }
    public void settab(int tab){
        this.tab=tab;
    }
    public int getspace(){
        return space;
    }
    public void setspace(int space){
        this.space=space;
    }
    public int getlines(){
        return lines;
    }
    public void setlines(int lines){
        this.lines=lines;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
