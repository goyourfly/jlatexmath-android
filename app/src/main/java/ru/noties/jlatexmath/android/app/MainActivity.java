package ru.noties.jlatexmath.android.app;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import org.scilab.forge.jlatexmath.Box;

import java.util.ArrayList;
import java.util.List;

import ru.noties.debug.AndroidLogDebugOutput;
import ru.noties.debug.Debug;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
import ru.noties.jlatexmath.JLatexMathView;

public class MainActivity extends Activity {

    static {
        Debug.init(new AndroidLogDebugOutput(true));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        final JLatexMathView jLatexMathView = findViewById(R.id.j_latex_math_view);

//        final View view = new View(this);
//        setContentView(view);

//        setContentView(R.layout.activity_main);

        final List<String> latexList = new ArrayList<>();

//        String latex = "\\begin{array}{cc}";
//        latex += "\\fbox{\\text{您好A framed box with \\textdbend}}&\\shadowbox{\\text{A shadowed box}}\\cr";
//        latex += "\\doublebox{\\text{A double framed box}}&\\ovalbox{\\text{An oval framed box}}\\cr";
//        latex += "\\end{array}";
//        latexList.add(latex);
//        latex = "{a \\bangle b} {c \\brace d} {e \\brack f} {g \\choose h}";
//        latexList.add(latex);
//
//        latex = "\\text{A long division \\longdiv{12345}{13}";
//        latexList.add(latex);
//
//        latex = "\\begin{array}{|c|l|||r|c|}";
//        latex += "\\hline";
//        latex += "\\text{Matrix}&\\multicolumn{2}{|c|}{\\text{Multicolumns}}&\\text{Font sizes commands}\\cr";
//        latex += "\\hline";
//        latex += "\\begin{pmatrix}\\alpha_{11}&\\cdots&\\alpha_{1n}\\cr\\hdotsfor{3}\\cr\\alpha_{n1}&\\cdots&\\alpha_{nn}\\end{pmatrix}&\\Large \\text{Large Right}&\\small \\text{small Left}&\\tiny \\text{tiny Tiny}\\cr";
//        latex += "\\hline";
//        latex += "\\multicolumn{4}{|c|}{\\Huge \\text{Huge Multicolumns}}\\cr";
//        latex += "\\hline";
//        latex += "\\end{array}";
//        latexList.add(latex);
//
//        latex = "\\definecolor{gris}{gray}{0.9}";
//        latex += "\\definecolor{noir}{rgb}{0,0,0}";
//        latex += "\\definecolor{bleu}{rgb}{0,0,1}\\newcommand{\\pa}{\\left|}";
//        latex += "\\begin{array}{c}";
//        latex += "\\JLaTeXMath\\\\";
//        latex += "\\begin{split}";
//        latex += " &Тепловой\\ поток\\ \\mathrm{Тепловой\\ поток}\\ \\mathtt{Тепловой\\ поток}\\\\";
//        latex += " &\\boldsymbol{\\mathrm{Тепловой\\ поток}}\\ \\mathsf{Тепловой\\ поток}\\\\";
//        latex += "|I_2| &= \\pa\\int_0^T\\psi(t)\\left\\{ u(a,t)-\\int_{\\gamma(t)}^a \\frac{d\\theta}{k} (\\theta,t) \\int_a^\\theta c(\\xi) u_t (\\xi,t)\\,d\\xi\\right\\}dt\\right|\\\\";
//        latex += "&\\le C_6 \\Bigg|\\pa f \\int_\\Omega \\pa\\widetilde{S}^{-1,0}_{a,-} W_2(\\Omega, \\Gamma_1)\\right|\\ \\right|\\left| |u|\\overset{\\circ}{\\to} W_2^{\\widetilde{A}}(\\Omega;\\Gamma_r,T)\\right|\\Bigg|\\\\";
//        latex += "&\\\\";
//        latex += "&\\textcolor{magenta}{\\mathrm{Produit\\ avec\\ Java\\ et\\ \\LaTeX\\ par\\ }\\mathscr{C}\\mathcal{A}\\mathfrak{L}\\mathbf{I}\\mathtt{X}\\mathbb{T}\\mathsf{E}}\\\\";
//        latex += "&\\begin{pmatrix}\\alpha&\\beta&\\gamma&\\delta\\\\\\aleph&\\beth&\\gimel&\\daleth\\\\\\mathfrak{A}&\\mathfrak{B}&\\mathfrak{C}&\\mathfrak{D}\\\\\\boldsymbol{\\mathfrak{a}}&\\boldsymbol{\\mathfrak{b}}&\\boldsymbol{\\mathfrak{c}}&\\boldsymbol{\\mathfrak{d}}\\end{pmatrix}\\quad{(a+b)}^{\\frac{n}{2}}=\\sqrt{\\sum_{k=0}^n\\tbinom{n}{k}a^kb^{n-k}}\\quad \\Biggl(\\biggl(\\Bigl(\\bigl(()\\bigr)\\Bigr)\\biggr)\\Biggr)\\\\";
//        latex += "&\\forall\\varepsilon\\in\\mathbb{R}_+^*\\ \\exists\\eta>0\\ |x-x_0|\\leq\\eta\\Longrightarrow|f(x)-f(x_0)|\\leq\\varepsilon\\\\";
//        latex += "&\\det\\begin{bmatrix}a_{11}&a_{12}&\\cdots&a_{1n}\\\\a_{21}&\\ddots&&\\vdots\\\\\\vdots&&\\ddots&\\vdots\\\\a_{n1}&\\cdots&\\cdots&a_{nn}\\end{bmatrix}\\overset{\\mathrm{def}}{=}\\sum_{\\sigma\\in\\mathfrak{S}_n}\\varepsilon(\\sigma)\\prod_{k=1}^n a_{k\\sigma(k)}\\\\";
//        latex += "&\\Delta f(x,y)=\\frac{\\partial^2f}{\\partial x^2}+\\frac{\\partial^2f}{\\partial y^2}\\qquad\\qquad \\fcolorbox{noir}{gris}{n!\\underset{n\\rightarrow+\\infty}{\\sim} {\\left(\\frac{n}{e}\\right)}^n\\sqrt{2\\pi n}}\\\\";
//        latex += "&\\sideset{_\\alpha^\\beta}{_\\gamma^\\delta}{\\begin{pmatrix}a&b\\\\c&d\\end{pmatrix}}\\xrightarrow[T]{n\\pm i-j}\\sideset{^t}{}A\\xleftarrow{\\overrightarrow{u}\\wedge\\overrightarrow{v}}\\underleftrightarrow{\\iint_{\\mathds{R}^2}e^{-\\left(x^2+y^2\\right)}\\,\\mathrm{d}x\\mathrm{d}y}";
//        latex += "\\end{split}\\\\";
//        latex += "\\rotatebox{30}{\\sum_{n=1}^{+\\infty}}\\quad\\mbox{Mirror rorriM}\\reflectbox{\\mbox{Mirror rorriM}}";
//        latex += "\\end{array}";
//        latexList.add(latex);
//
//
//        latex = "\\begin{array}{l}";
//        latex += "\\forall\\varepsilon\\in\\mathbb{R}_+^*\\ \\exists\\eta>0\\ |x-x_0|\\leq\\eta\\Longrightarrow|f(x)-f(x_0)|\\leq\\varepsilon\\\\";
//        latex += "\\det\\begin{bmatrix}a_{11}&a_{12}&\\cdots&a_{1n}\\\\a_{21}&\\ddots&&\\vdots\\\\\\vdots&&\\ddots&\\vdots\\\\a_{n1}&\\cdots&\\cdots&a_{nn}\\end{bmatrix}\\overset{\\mathrm{def}}{=}\\sum_{\\sigma\\in\\mathfrak{S}_n}\\varepsilon(\\sigma)\\prod_{k=1}^n a_{k\\sigma(k)}\\\\";
//        latex += "\\sideset{_\\alpha^\\beta}{_\\gamma^\\delta}{\\begin{pmatrix}a&b\\\\c&d\\end{pmatrix}}\\\\";
//        latex += "\\int_0^\\infty{x^{2n} e^{-a x^2}\\,dx} = \\frac{2n-1}{2a} \\int_0^\\infty{x^{2(n-1)} e^{-a x^2}\\,dx} = \\frac{(2n-1)!!}{2^{n+1}} \\sqrt{\\frac{\\pi}{a^{2n+1}}}\\\\";
//        latex += "\\int_a^b{f(x)\\,dx} = (b - a) \\sum\\limits_{n = 1}^\\infty  {\\sum\\limits_{m = 1}^{2^n  - 1} {\\left( { - 1} \\right)^{m + 1} } } 2^{ - n} f(a + m\\left( {b - a} \\right)2^{-n} )\\\\";
//        latex += "\\int_{-\\pi}^{\\pi} \\sin(\\alpha x) \\sin^n(\\beta x) dx = \\textstyle{\\left \\{ \\begin{array}{cc} (-1)^{(n+1)/2} (-1)^m \\frac{2 \\pi}{2^n} \\binom{n}{m} & n \\mbox{ odd},\\ \\alpha = \\beta (2m-n) \\\\ 0 & \\mbox{otherwise} \\\\ \\end{array} \\right .}\\\\";
//        latex += "L = \\int_a^b \\sqrt{ \\left|\\sum_{i,j=1}^ng_{ij}(\\gamma(t))\\left(\\frac{d}{dt}x^i\\circ\\gamma(t)\\right)\\left(\\frac{d}{dt}x^j\\circ\\gamma(t)\\right)\\right|}\\,dt\\\\";
//        latex += "\\begin{array}{rl} s &= \\int_a^b\\left\\|\\frac{d}{dt}\\vec{r}\\,(u(t),v(t))\\right\\|\\,dt \\\\ &= \\int_a^b \\sqrt{u'(t)^2\\,\\vec{r}_u\\cdot\\vec{r}_u + 2u'(t)v'(t)\\, \\vec{r}_u\\cdot\\vec{r}_v+ v'(t)^2\\,\\vec{r}_v\\cdot\\vec{r}_v}\\,\\,\\, dt. \\end{array}\\\\";
//        latex += "\\end{array}";
//        latexList.add(latex);
//
//        latex = "\\begin{array}{lr}\\mbox{\\textcolor{Blue}{Russian}}&\\mbox{\\textcolor{Melon}{Greek}}\\\\";
//        latex += "\\mbox{" + "привет мир".toUpperCase() + "}&\\mbox{" + "γειά κόσμο".toUpperCase()
//                + "}\\\\";
//        latex += "\\mbox{привет мир}&\\mbox{γειά κόσμο}\\\\";
//        latex += "\\mathbf{\\mbox{привет мир}}&\\mathbf{\\mbox{γειά κόσμο}}\\\\";
//        latex += "\\mathit{\\mbox{привет мир}}&\\mathit{\\mbox{γειά κόσμο}}\\\\";
//        latex += "\\mathsf{\\mbox{привет мир}}&\\mathsf{\\mbox{γειά κόσμο}}\\\\";
//        latex += "\\mathtt{\\mbox{привет мир}}&\\mathtt{\\mbox{γειά κόσμο}}\\\\";
//        latex += "\\mathbf{\\mathit{\\mbox{привет мир}}}&\\mathbf{\\mathit{\\mbox{γειά κόσμο}}}\\\\";
//        latex += "\\mathbf{\\mathsf{\\mbox{привет мир}}}&\\mathbf{\\mathsf{\\mbox{γειά κόσμο}}}\\\\";
//        latex += "\\mathsf{\\mathit{\\mbox{привет мир}}}&\\mathsf{\\mathit{\\mbox{γειά κόσμο}}}\\\\";
//        latex += "&\\\\";
//        latex += "\\mbox{\\textcolor{Salmon}{Bulgarian}}&\\mbox{\\textcolor{Tan}{Serbian}}\\\\";
//        latex += "\\mbox{здравей свят}&\\mbox{Хелло уорлд}\\\\";
//        latex += "&\\\\";
//        latex += "\\mbox{\\textcolor{Turquoise}{Bielorussian}}&\\mbox{\\textcolor{LimeGreen}{Ukrainian}}\\\\";
//        latex += "\\mbox{прывітаньне Свет}&\\mbox{привіт світ}\\\\";
//        latex += "\\end{array}";
//        latexList.add(latex);
//
        final ViewGroup linearLayout = findViewById(R.id.container);
        linearLayout.removeAllViews();
//
//        latexList.add("\\prod _ { k = 1 } ^ { 4 } ( k + 2 )");
//        latexList.add("\\exists \\ln \\in N : n + 5 = 2 n");
//        latexList.add("\\forall n \\in N : n ^ { 2 } \\geq n");
//        latexList.add("G _ { U } A = \\{ x | x \\in U \\text { and } x \\notin A \\}");
//        latexList.add("n _ { 1 } < 4 \\wedge n > 2 \\Leftrightarrow n = 3");
//        latexList.add("\\text { 若 } f ( x ) = 2 x \\text { 且 } g ( x ) = x + 3 , \\text { 则 } ( f \\circ g ) ( x ) = 2 ( x + 3 )");
//        latexList.add("\\left. \\begin{array} { l } { \\text { Select the equivalent expression. } } \\\\ { ( a ^ { - 2 } \\cdot 8 ^ { 7 } ) ^ { 2 } = ? } \\end{array} \\right.");
//
//        latexList.add("macros from amsmath and symbols from amssymb and stmaryrd");
//        latexList.add("\\text{macros from amsmath and symbols from amssymb and stmaryrd, fkldjskajfkd safdksajfkl dskajfk dlsa fldksa fdsakf dlsaf  }");
//        latexList.add("x=\\left\\{\\begin{array}{c}\\frac{\\pi}{6} + 2\\pi k \\\\ \\frac{5\\pi}{6} + 2\\pi k \\end{array}\\right., k\\in \\mathbb{z}");
//        latexList.add("\\operatorname { Lim }_{ x \\rightarrow 0 } \\frac { \\tan 5 x } { \\tan 2 \\pi x }");
//        latexList.add("\\operatorname * { Lim }_{ x \\rightarrow 0 } \\frac { \\tan 5 x } { \\tan 2 \\pi x }");
//        latexList.add("\\sum_{123}^{456} ");
//        latexList.add("\\lim_{x \\to \\infty}");
//        latexList.add(" {\\textstyle \\sum_{1}^{2}} ");
//        latexList.add("\\log _ { 2 } 2 ^ { 5 }");
//        latexList.add("x_3");
//        latexList.add("\\sqrt{5}");
        latexList.add("\\sum _ { k = 0 } ^ { 3 } 2 k =");
        latexList.add("\\int\\limits_{a} ^ {b}");

        for (String str : latexList){
            JLatexMathView view = new JLatexMathView(this);
            view.textSize(18*5);
            view.textColor(Color.BLACK);
            linearLayout.addView(view);
            view.setLatex(str);
        }
        linearLayout.requestLayout();
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViews();
                for (String str : latexList){
                    JLatexMathView view = new JLatexMathView(MainActivity.this);
                    view.textSize(18*5);
                    view.textColor(Color.BLACK);
                    linearLayout.addView(view);
                    view.setLatex(str);
                }
            }
        });

//final JLatexMathDrawable drawable = JLatexMathDrawable.builder(latex)
//        .textSize(70)
//        .padding(8)
//        .background(0xFFff0000)
//        .align(JLatexMathDrawable.ALIGN_RIGHT)
//        .build();
//
//        view.setBackground(drawable);


//        final LatexMathView latexMathView = findViewById(R.id.latex_math_view);
//        latexMathView.setLatexMath(latex);

//        latex = "${CO _{2} +H _{2} O \\mathrel{\\mathop{\\kern{0pt}\\longrightarrow}\\limits_{叶绿素}^{日光}}}$";
//        latex = "\\rm 2H_{2}O \\mathop{\\substack{= \\!= \\!= \\!= \\!= \\!= }}^{电解}2H_{2}\\uparrow + O_{2}\\uparrow ";
//        latex = "解：∵${A\\cup B= \\{1,\\, 2\\}}$，\\\\则${A}$，${B}$均为${\\{1,\\, 2\\}}$的子集，\\\\即${A}$，${B\\in \\{\\varnothing ,\\, \\{1\\},\\, \\{2\\},\\, \\{1,\\, 2\\}\\}}$，\\\\当${A= \\varnothing }$时，${B= \\{1,\\, 2\\}}$，\\\\当${A= \\{1\\}}$时，${B= \\{1,\\, 2\\}}$或${B= \\{2\\}}$，\\\\当${A= \\{2\\}}$时，${B= \\{1,\\, 2\\}}$或${B= \\{1\\}}$，\\\\${A= \\{1,\\, 2\\}}$时，${B= \\{1,\\, 2\\}}$，或${B= \\{1\\}}$，或${B= \\{2\\}}$，或${B= \\varnothing }$，\\\\共${9}$种情况，\\\\故选：${D}$";
//
//        latex = "";
//        latex = "\\bold";
//        latex = "\\bolda";
////        latex = "\\bold(";
//        latex = "^";
//        latex = "^a";
//        latex = "{";
//        latex = "{}";
//        latex = "}";
////        latex = "{abc}";
//
//        latex = "${CO _{2} +H _{2} O \\mathrel{\\mathop{\\kern{0pt}\\longrightarrow}\\limits_{叶绿素}^{日光}}}$";

//        latex = "1+1=2";
//        Log.w("AA", "latex = " + latex);
//
//        Exception exception = null;
//        try {
//            jLatexMathView.setLatex(latex, true);
//        } catch (Exception e) {
//            exception = e;
//        }
//
//
//        if (exception != null) {
//            Log.w("AA", exception.toString());
//        } else {
//            JLatexMathDrawable d = jLatexMathView.getDrawable();
//            Box box = d.getIcon().getBox();
//            Log.w("AA", "box = " + box.getClass().getName());
//            Log.w("AA", "isEmpty = " + box.isEmpty());
//        }
//
//        if (true) {
//            final String s = "$$here is $ some$$\n\n$$\\beginarray{}\n\\whatever {}1,2_+$$";
//        }
    }
}
