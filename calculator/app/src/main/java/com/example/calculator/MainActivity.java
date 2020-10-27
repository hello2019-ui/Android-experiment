package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //实例化文本框变量
    TextView text;

    //实例化点击按钮
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,
            btn_7,btn_8,btn_9,btn_clear,btn_percent,
            btn_leftbra,btn_rightbra,btn_PandM,
            btn_squ2,btn_sin,btn_cos,btn_div,btn_mul,
            btn_sub,btn_add,btn_equ,btn_p;

    //重写onCreate，
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener((View.OnClickListener) this);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener((View.OnClickListener) this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener((View.OnClickListener) this);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener((View.OnClickListener) this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener((View.OnClickListener) this);

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener((View.OnClickListener) this);

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener((View.OnClickListener) this);

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener((View.OnClickListener) this);

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener((View.OnClickListener) this);

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener((View.OnClickListener) this);

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener((View.OnClickListener) this);

        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_percent.setOnClickListener((View.OnClickListener) this);

        btn_leftbra = (Button) findViewById(R.id.btn_leftbra);
        btn_leftbra.setOnClickListener((View.OnClickListener) this);

        btn_rightbra = (Button) findViewById(R.id.btn_rightbra);
        btn_rightbra.setOnClickListener((View.OnClickListener) this);

        btn_PandM = (Button) findViewById(R.id.btn_PandM);
        btn_PandM.setOnClickListener((View.OnClickListener) this);

        btn_squ2 = (Button) findViewById(R.id.btn_squ2);
        btn_squ2.setOnClickListener((View.OnClickListener) this);

        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener((View.OnClickListener) this);

        btn_cos = (Button) findViewById(R.id.btn_del);
        btn_cos.setOnClickListener((View.OnClickListener) this);

        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener((View.OnClickListener) this);

        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener((View.OnClickListener) this);

        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener((View.OnClickListener) this);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener((View.OnClickListener) this);

        btn_equ = (Button) findViewById(R.id.btn_equ);
        btn_equ.setOnClickListener((View.OnClickListener) this);

        btn_p = (Button) findViewById(R.id.btn_p);
        btn_p.setOnClickListener((View.OnClickListener) this);

        text=(TextView) findViewById(R.id.text);

    }

    //重写点击事件
    @Override
    public void onClick(View v){

        //获取当前文本框内信息
        String str = text.getText().toString();

        switch(v.getId()){
            case R.id.btn_clear:
                str="0";
                text.setText(str);
                break;
            case R.id.btn_0:
                if (str.equals("0")){
                    str="0";
                }
                else{
                    str+="0";
                }
                text.setText(str);
                break;
            case R.id.btn_1:
                if (str.equals("0")){
                    str="1";
                }
                else{
                    str+="1";
                }
                text.setText(str);
                break;
            case R.id.btn_2:
                if (str.equals("0")){
                    str="2";
                }
                else{
                    str+="2";
                }
                text.setText(str);
                break;
            case R.id.btn_3:
                if (str.equals("0")){
                    str="3";
                }
                else{
                    str+="3";
                }
                text.setText(str);
                break;
            case R.id.btn_4:
                if (str.equals("0")){
                    str="4";
                }
                else{
                    str+="4";
                }
                text.setText(str);
                break;
            case R.id.btn_5:
                if (str.equals("0")){
                    str="5";
                }
                else{
                    str+="5";
                }
                text.setText(str);
                break;
            case R.id.btn_6:
                if (str.equals("0")){
                    str="6";
                }
                else{
                    str+="6";
                }
                text.setText(str);
                break;
            case R.id.btn_7:
                if (str.equals("0")){
                    str="7";
                }
                else{
                    str+="7";
                }
                text.setText(str);
                break;
            case R.id.btn_8:
                if (str.equals("0")){
                    str="8";
                }
                else{
                    str+="8";
                }
                text.setText(str);
                break;
            case R.id.btn_9:
                if (str.equals("0")){
                    str="9";
                }
                else{
                    str+="9";
                }
                text.setText(str);
                break;
            //点击小数点
            case R.id.btn_p:
                //如果小数点前是操作符，括号或小数点，则报错
                if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)==')'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"非法输入!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                //不能有0.0.0.0的情况
                else if(str.contains(".")){
                    int i = str.length()-1;
                    int x = 1; //x作为判断是否能加"."的标志，0为可以，1为不能
                    while(str.charAt(i)!='.'&&i >= 0){ //找到距离最近的"."
                        i--;
                    }
                    for(int j = i; j < str.length(); j++){
                        //检查两个"."之间有没有运算符，若有则表示可以加"."，否则不允许加
                        if(str.charAt(j) == '+'||str.charAt(j) == '-'||str.charAt(j) == '×'||str.charAt(j) == '÷'){
                            x = 0;
                        }
                    }
                    if(x == 1){
                        Toast.makeText(MainActivity.this,"非法输入!",Toast.LENGTH_SHORT).show();
                        text.setText(str);
                    }
                    else{
                        str+=".";
                        text.setText(str);
                    }
                }
                else{
                    str+=".";
                    text.setText(str);
                }
                break;
            //点击加号
            case R.id.btn_add:
                //加号前不能是+-*/(或小数点
                if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"非法输入!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="+";
                    text.setText(str);
                }
                break;
            //点击减号
            case R.id.btn_sub:
                //减号前不能是操作符,(或小数点
                if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"非法输入!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "-";
                    text.setText(str);
                }
                break;
            //点击乘号
            case R.id.btn_mul:
                //乘号前不能有操作符,(或小数点
                if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"非法输入!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "×";
                    text.setText(str);
                }
                break;
            //点击除号
            case R.id.btn_div:
                //除号前不能为操作符,(或小数点
                if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"非法输入!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "÷";
                    text.setText(str);
                }
                break;

            case R.id.btn_leftbra:
                if (str.length()==1&&!str.contains("(")&&str.charAt(0)=='0'){
                    str="(";
                }
                //在正数前面加括号
                else if(!str.contains("+")&&!str.contains("-")&&!str.contains("×")&&!str.contains("÷")){
                    str="("+str;
                }
                //在负数前面加括号
                else if(!str.contains("+")&&!str.contains("×")&&!str.contains("÷")){
                    String strx = new String();
                    for(int i = 1; i < str.length(); i++){
                        strx += str.charAt(i);
                    }
                    //除第一位是负号之外，其他地方不含负号
                    if (!strx.contains("-")&&str.charAt(0) == '-') {
                        str="("+str;
                    }
                    else{
                        str += "(";
                    }
                }
                else if (str.charAt(str.length()-1) != ')') {
                    str = str + "(";
                }
                text.setText(str);
                break;

            case R.id.btn_rightbra:
                if (str.length()==1){
                    str="0";
                }
                //右括号前不能出现操作符，左括号和小数点
                if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'){
                    Toast.makeText(MainActivity.this,"非法操作!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += ")";
                }
                text.setText(str);
                break;
            case R.id.btn_equ:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'){
                    Toast.makeText(MainActivity.this,"请完善算式!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    String ero = isMatched(str); //检查括号是否匹配
                    if (ero.equals("no error")) { //若括号匹配
                        String re = getResult(); //得到结果
                        if (re.contains("Infinity")) { //结果报错
                            Toast.makeText(MainActivity.this, "不能除0!", Toast.LENGTH_SHORT).show();
                            text.setText("0");
                        } else {
                            text.setText(re); //结果无错，输出
                        }
                    } else { //括号不匹配，输出报错
                        Toast.makeText(MainActivity.this, ero, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.btn_squ2:
                if(str.charAt(0)=='-'){
                    Toast.makeText(MainActivity.this,"负数不能开平方根！",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else if(str.contains("+")||str.contains("-")||str.contains("×")||str.contains("÷")||str.contains("(")||str.contains(")")){
                    Toast.makeText(MainActivity.this,"请先得到结果!",Toast.LENGTH_SHORT).show();
                }
                else{
                    double x=Double.parseDouble(str);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
            case R.id.btn_percent:
                if(str.contains("+")||str.contains("-")||str.contains("×")||str.contains("÷")||str.contains("(")||str.contains(")")){
                Toast.makeText(MainActivity.this,"请先得到结果!",Toast.LENGTH_SHORT).show();
            }
                else{
                    double per=Double.parseDouble(str);
                    per=per/100;
                    String per1=""+per;
                    per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                    per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(per1);
                }
                break;
            case R.id.btn_sin:
                if(!str.contains("+")&&!str.contains("×")&&!str.contains("÷")&&!str.contains("(")&&!str.contains(")"))
                {
                    String strx = new String();
                    strx = str.substring(1,str.length());

                    if(str.contains("-")){
                        if(!strx.contains("-")&&str.charAt(0)=='-'){
                            double sinn=Double.parseDouble(str);
                            sinn=Math.toRadians(sinn);
                            sinn=Math.sin(sinn);
                            String sinn1=String.format("%.9f",sinn);//规避极小误差，最多9位小数的十进制表达
                            sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                            sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                            sinn1 = sinn1;
                            text.setText(sinn1);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "请先得到结果!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    else{
                        double sinn=Double.parseDouble(str);
                        sinn=Math.toRadians(sinn);
                        sinn=Math.sin(sinn);
                        String sinn1=String.format("%.9f",sinn);//规避极小误差，最多9位小数的十进制表达
                        sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                        sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                        text.setText(sinn1);
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "请先得到结果!", Toast.LENGTH_SHORT).show();
                }
                break;
            //消去一位
            case R.id.btn_del:
                //若只有一位或0位则直接变为0
                if (str.length()<2)
                    str = "0";
                //否则减一位
                else{
                    String strx = new String();
                    strx = str.substring(0,str.length() - 1);
                    str = strx;
                }
                text.setText(str);
                break;
            //正负号转换
            case R.id.btn_PandM:
                //若为正数
                if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                    //若为零
                    if(str.equals("0")){
                        text.setText("0");
                    }
                    else{
                        text.setText("-"+str);
                    }
                }
                //若为负数
                else if(str.charAt(0)=='-')
                    text.setText(str.substring(1,str.length()));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }
    /**
     * 将中缀表达式转换成后缀表达式
     * 从左到右遍历中缀中的每个字符，若为数字，则输出为后缀的一部分
     * 若为操作符，则判断有无括号，有括号的先弹出并加到后缀表达式中，无括号的继续积累，最后依次弹出，加到后缀表达式中
     */
    public static StringBuffer toPostfix(String infix){
        Stack<String> stack=new Stack<String>();   //运算符栈,顺序栈
        StringBuffer postfix=new StringBuffer(infix.length()*2);   //后缀表达式字符串
        int i=0;
        while(i<infix.length()){
            char ch=infix.charAt(i);
            switch(ch){
                case '+':
                case '-':
                    while(!stack.isEmpty()&&!stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());   //且添加到后缀表达式串
                    stack.push(ch+""); //否则ch入栈
                    i++;
                    break;

                case '×':
                case '÷':
                    while(!stack.isEmpty()&&(stack.peek().equals("×")||stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++;
                    break;

                case '(':
                    stack.push(ch+""); //直接入栈
                    i++;
                    break;

                case ')':
                    String out=stack.pop();
                    while(out!=null&&!out.equals("(")){    //如果栈顶元素不为空且不为"("时
                        postfix.append(out);   //添加到后缀表达式串
                        out=stack.pop();   //把此时位于栈顶的"("弹出
                    }
                    i++;
                    break;

                default:
                    while((i<infix.length()&&ch>='0'&&ch<='9')||(i<infix.length()&&ch=='.')){
                        postfix.append(ch);    //如果是数字或小数点，则直接添加到后缀表达式串
                        i++;
                        if(i<infix.length())
                            ch=infix.charAt(i);
                    }
                    postfix.append(" ");
            }

        }
        while(!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());   //添加到后缀表达式中
        return postfix;
    }

    //计算后缀表达式
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new Stack<Double>();   //操作数栈,链式栈
        double value=0;
        int j=0;
        for(int i=0;i<postfix.length();i++){
            j=i;
            char ch=postfix.charAt(i);
            if ((ch>='0'&&ch<='9')||ch=='.') {
                value=0;
                while(ch!=' '){
                    while(ch!=' '&&ch!='.'){ //为整数时，加到数字串中去
                        value=value*10+ch-'0';
                        j++;
                        ch=postfix.charAt(++i);
                    }
                    if(ch!=' '&&ch=='.') //为"."时，跳过该小数点
                        ch=postfix.charAt(++i);
                    while(ch!=' '&&(i>=j+1)){ //输出一个多位数
                        //使用大数集
                        BigDecimal valueBD=new BigDecimal(Double.toString(value));
                        BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                        BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                        double temp=chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                        value=valueBD.add(tempBD).doubleValue();
                        ch=postfix.charAt(++i);
                    }

                    stack.push(value);
                }

            }
            else{
                if(ch!=' '){
                    Double y=stack.pop();
                    if(!stack.isEmpty()){
                        Double x=stack.pop();
                        switch(ch){
                            case'+':
                                value=x+y;
                                break;
                            case'-':
                                value=x-y;
                                break;
                            case'×':
                                value=x*y;
                                break;
                            case'÷':
                                value=x/y;
                                break;
                        }
                    }
                    else{
                        switch(ch){
                            case'+':
                                value=0+y;
                                break;
                            case'-':
                                value=0-y;
                                break;
                            case'×':
                                value=0*y;
                                break;
                            case'÷':
                                value=0/y;
                                break;
                        }
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }
    public String getResult(){
        String infix = text.getText().toString();
        StringBuffer postfix=toPostfix(infix); //调用toPostfix转后缀表达式
        Double result=toValue(postfix); //调用toValue计算后缀表达式
        String re=String.format("%.7f",result);//规避极小误差
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }

    public static String isMatched(String infix){
        Stack<String> stack=new Stack<String>();
        for (int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            switch(ch){
                case'(':
                    stack.push(ch+""); //若为"("压栈
                    break;
                case')':
                    if(stack.isEmpty()||!stack.pop().equals("(")) //若为")"，检查栈空否？弹栈：缺少"("
                        return "缺少 (";
            }
        }
        return(stack.isEmpty())?"no error":"缺少 )"; //结尾检查，若栈空则匹配完成，否则缺少")"
    }
}