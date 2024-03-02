package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xfloattextfield");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xfloattextfield.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mtextfield = null;
public int _animationduration = 0;
public float _largelabeltextsize = 0f;
public float _smalllabeltextsize = 0f;
public boolean _largelabel = false;
public anywheresoftware.b4a.objects.B4XCanvas _measuringcanvas = null;
public int _hintcolor = 0;
public int _nonfocusedhintcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _hintimageview = null;
public String _hinttext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _hintfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largefocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largenotfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallnotfocused = null;
public boolean _focused = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblv = null;
public anywheresoftware.b4a.objects.collections.Map _mprops = null;
public Object _tag = null;
public String _keyboardtype = "";
public boolean _multiline = false;
public b4a.example.b4xfloattextfield _mnexttextfield = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public int _hintlabellargeoffsetx = 0;
public int _hintlabelsmalloffsety = 0;
public int _hintlabelsmalloffsetx = 0;
public long _lastswitchtextfieldtime = 0L;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _base_resize(double _width,double _height) throws Exception{
int _firstdistance = 0;
 //BA.debugLineNum = 196;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 197;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
_mtextfield.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 198;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 199;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (_multiline && _xui.getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
 //BA.debugLineNum = 200;BA.debugLine="If lblV.IsInitialized Then";
if (_lblv.IsInitialized()) { 
 //BA.debugLineNum = 201;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
_lblv.SetLayoutAnimated((int) (0),(int) (_width-_lblv.getWidth()-_firstdistance),(int) (0),_lblv.getWidth(),(int) (_height));
 //BA.debugLineNum = 202;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+_lblv.getWidth()+__c.DipToCurrent((int) (2)));
 };
 //BA.debugLineNum = 204;BA.debugLine="If lblClear.IsInitialized Then";
if (_lblclear.IsInitialized()) { 
 //BA.debugLineNum = 205;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
_lblclear.SetLayoutAnimated((int) (0),(int) (_width-_lblclear.getWidth()-_firstdistance),(int) (0),_lblclear.getWidth(),(int) (_height));
 };
 //BA.debugLineNum = 207;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_updatelabel(_mtextfield.getText(),__c.True);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 18;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 19;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 21;BA.debugLine="Private mTextField As B4XView";
_mtextfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public AnimationDuration As Int = 200";
_animationduration = (int) (200);
 //BA.debugLineNum = 23;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_largelabeltextsize = (float) (18);
_smalllabeltextsize = (float) (14);
 //BA.debugLineNum = 24;BA.debugLine="Private LargeLabel As Boolean";
_largelabel = false;
 //BA.debugLineNum = 25;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_measuringcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 26;BA.debugLine="Public HintColor As Int";
_hintcolor = 0;
 //BA.debugLineNum = 27;BA.debugLine="Public NonFocusedHintColor As Int";
_nonfocusedhintcolor = 0;
 //BA.debugLineNum = 28;BA.debugLine="Private HintImageView As B4XView";
_hintimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Public HintText As String";
_hinttext = "";
 //BA.debugLineNum = 30;BA.debugLine="Public HintFont As B4XFont";
_hintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 31;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_largefocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_largenotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallnotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Public Focused As Boolean";
_focused = false;
 //BA.debugLineNum = 33;BA.debugLine="Public lblClear As B4XView";
_lblclear = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Public lblV As B4XView";
_lblv = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private mProps As Map";
_mprops = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 36;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 37;BA.debugLine="Private KeyboardType As String 'ignore";
_keyboardtype = "";
 //BA.debugLineNum = 38;BA.debugLine="Private Multiline As Boolean";
_multiline = false;
 //BA.debugLineNum = 39;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_mnexttextfield = new b4a.example.b4xfloattextfield();
 //BA.debugLineNum = 41;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 46;BA.debugLine="Public HintLabelLargeOffsetX, HintLabelSmallOffse";
_hintlabellargeoffsetx = 0;
_hintlabelsmalloffsety = __c.DipToCurrent((int) (2));
_hintlabelsmalloffsetx = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 47;BA.debugLine="Private LastSwitchTextFieldTime As Long";
_lastswitchtextfieldtime = 0L;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _createacceptbutton() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Private Sub CreateAcceptButton";
 //BA.debugLineNum = 126;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((_mprops.GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 127;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
_lblv = _createbutton(BA.ObjectToString(__c.Chr(((int)0xe5ca))));
 //BA.debugLineNum = 128;BA.debugLine="lblV.Tag = \"v\"";
_lblv.setTag((Object)("v"));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
 //BA.debugLineNum = 257;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
 //BA.debugLineNum = 258;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 259;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2)))),(int) (__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2)))));
 //BA.debugLineNum = 260;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 261;BA.debugLine="c.Initialize(p)";
_c.Initialize(_p);
 //BA.debugLineNum = 262;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 263;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(ba,_hinttext,(float) (_p.getWidth()/(double)2),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 264;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
 //BA.debugLineNum = 265;BA.debugLine="c.Release";
_c.Release();
 //BA.debugLineNum = 266;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createbutton(String _text) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
 //BA.debugLineNum = 182;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
 //BA.debugLineNum = 183;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 184;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
 //BA.debugLineNum = 185;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
 //BA.debugLineNum = 186;BA.debugLine="x = lc";
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
 //BA.debugLineNum = 187;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(_xui.CreateMaterialIcons((float) (20)));
 //BA.debugLineNum = 188;BA.debugLine="x.Text = Text";
_x.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 189;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(_mtextfield.getTextColor());
 //BA.debugLineNum = 190;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
 //BA.debugLineNum = 191;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 192;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
_mbase.AddView((android.view.View)(_x.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 193;BA.debugLine="Return x";
if (true) return _x;
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public String  _createclearbutton() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Private Sub CreateClearButton";
 //BA.debugLineNum = 118;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((_mprops.GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 119;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (_lblclear.IsInitialized() && _lblclear.getParent().IsInitialized()) { 
_lblclear.RemoveViewFromParent();};
 //BA.debugLineNum = 120;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
_lblclear = _createbutton(BA.ObjectToString(__c.Chr(((int)0xe14c))));
 //BA.debugLineNum = 121;BA.debugLine="lblClear.Tag = \"clear\"";
_lblclear.setTag((Object)("clear"));
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _createrevealbutton() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Private Sub CreateRevealButton";
 //BA.debugLineNum = 133;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
_lblclear = _createbutton(BA.ObjectToString(__c.Chr(((int)0xe8f4))));
 //BA.debugLineNum = 134;BA.debugLine="lblClear.Tag = \"reveal\"";
_lblclear.setTag((Object)("reveal"));
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextfield(boolean _password) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;
 //BA.debugLineNum = 328;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
 //BA.debugLineNum = 344;BA.debugLine="Dim tf As EditText";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 345;BA.debugLine="tf.Initialize(\"tf\")";
_tf.Initialize(ba,"tf");
 //BA.debugLineNum = 346;BA.debugLine="tf.SingleLine = Not(Multiline)";
_tf.setSingleLine(__c.Not(_multiline));
 //BA.debugLineNum = 347;BA.debugLine="tf.PasswordMode = Password";
_tf.setPasswordMode(_password);
 //BA.debugLineNum = 348;BA.debugLine="If Password Then";
if (_password) { 
 //BA.debugLineNum = 349;BA.debugLine="If KeyboardType <> \"Text\" Then";
if ((_keyboardtype).equals("Text") == false) { 
 //BA.debugLineNum = 350;BA.debugLine="tf.InputType = Bit.Or(tf.INPUT_TYPE_NUMBERS, 16";
_tf.setInputType(__c.Bit.Or(_tf.INPUT_TYPE_NUMBERS,(int) (16)));
 }else {
 //BA.debugLineNum = 352;BA.debugLine="tf.InputType = Bit.Or(0x00000080, 0x00080000) '";
_tf.setInputType(__c.Bit.Or(((int)0x00000080),((int)0x00080000)));
 };
 }else {
 //BA.debugLineNum = 355;BA.debugLine="Select KeyboardType";
switch (BA.switchObjectToInt(_keyboardtype,"Numbers","Decimal")) {
case 0: {
 //BA.debugLineNum = 357;BA.debugLine="tf.InputType = tf.INPUT_TYPE_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_NUMBERS);
 break; }
case 1: {
 //BA.debugLineNum = 359;BA.debugLine="tf.InputType = tf.INPUT_TYPE_DECIMAL_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_DECIMAL_NUMBERS);
 break; }
}
;
 };
 //BA.debugLineNum = 362;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public String  _createtextfieldall(boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
 //BA.debugLineNum = 110;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
_mtextfield = _createtextfield(_passwordmode);
 //BA.debugLineNum = 111;BA.debugLine="mTextField.Font = Font1";
_mtextfield.setFont(_font1);
 //BA.debugLineNum = 112;BA.debugLine="mTextField.TextColor = TextColor";
_mtextfield.setTextColor(_textcolor);
 //BA.debugLineNum = 113;BA.debugLine="setNextField(mNextTextField)";
_setnextfield(_mnexttextfield);
 //BA.debugLineNum = 114;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
_mbase.AddView((android.view.View)(_mtextfield.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 67;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 68;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 69;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_tag = _mbase.getTag();
 //BA.debugLineNum = 69;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 70;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_mbase.SetColorAndBorder(_xui.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 71;BA.debugLine="mProps = Props";
_mprops = _props;
 //BA.debugLineNum = 72;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 73;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 74;BA.debugLine="iv.Initialize(\"HintImageView\")";
_iv.Initialize(ba,"HintImageView");
 //BA.debugLineNum = 75;BA.debugLine="HintImageView = iv";
_hintimageview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 76;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
_keyboardtype = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
 //BA.debugLineNum = 82;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
_hintcolor = _xui.PaintOrColorToColor(_props.Get((Object)("HintColor")));
 //BA.debugLineNum = 83;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
_nonfocusedhintcolor = _xui.PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
 //BA.debugLineNum = 85;BA.debugLine="HintText = Props.Get(\"Hint\")";
_hinttext = BA.ObjectToString(_props.Get((Object)("Hint")));
 //BA.debugLineNum = 86;BA.debugLine="HintFont = PassedLabel.Font";
_hintfont = _passedlabel.getFont();
 //BA.debugLineNum = 87;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
 //BA.debugLineNum = 88;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
_multiline = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
 //BA.debugLineNum = 89;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && _multiline) { 
 //BA.debugLineNum = 90;BA.debugLine="Multiline = False";
_multiline = __c.False;
 //BA.debugLineNum = 91;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.LogImpl("98650776","Multiline not supported with password mode.",0);
 };
 //BA.debugLineNum = 93;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
_createtextfieldall(_passwordmode,_passedlabel.getFont(),_xui.PaintOrColorToColor((Object)(_lbl.getTextColor())));
 //BA.debugLineNum = 95;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
_mbase.AddView((android.view.View)(_hintimageview.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 96;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 97;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 98;BA.debugLine="MeasuringCanvas.Initialize(p)";
_measuringcanvas.Initialize(_p);
 //BA.debugLineNum = 99;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 100;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
 //BA.debugLineNum = 101;BA.debugLine="CreateRevealButton";
_createrevealbutton();
 }else {
 //BA.debugLineNum = 103;BA.debugLine="CreateClearButton";
_createclearbutton();
 };
 //BA.debugLineNum = 105;BA.debugLine="CreateAcceptButton";
_createacceptbutton();
 //BA.debugLineNum = 106;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xfloattextfield  _getnextfield() throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
 //BA.debugLineNum = 296;BA.debugLine="Return mNextTextField";
if (true) return _mnexttextfield;
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 389;BA.debugLine="Return mTextField.Text";
if (true) return _mtextfield.getText();
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _gettextfield() throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Public Sub getTextField As B4XView";
 //BA.debugLineNum = 446;BA.debugLine="Return mTextField";
if (true) return _mtextfield;
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction() throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Private Sub ime_HandleAction As Boolean";
 //BA.debugLineNum = 315;BA.debugLine="tf_EnterPressed";
_tf_enterpressed();
 //BA.debugLineNum = 316;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (_mnexttextfield.IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 317;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 51;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 52;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 53;BA.debugLine="If xui.IsB4A Then";
if (_xui.getIsB4A()) { 
 //BA.debugLineNum = 54;BA.debugLine="HintLabelLargeOffsetX = 6dip";
_hintlabellargeoffsetx = __c.DipToCurrent((int) (6));
 }else {
 //BA.debugLineNum = 56;BA.debugLine="HintLabelLargeOffsetX = 12dip";
_hintlabellargeoffsetx = __c.DipToCurrent((int) (12));
 };
 //BA.debugLineNum = 59;BA.debugLine="IME.Initialize(\"ime\")";
_ime.Initialize("ime");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _lc_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
 //BA.debugLineNum = 403;BA.debugLine="Private Sub lc_Click";
 //BA.debugLineNum = 404;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 405;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
 //BA.debugLineNum = 407;BA.debugLine="setText(\"\")";
_settext("");
 break; }
case 1: {
 //BA.debugLineNum = 409;BA.debugLine="SwitchFromPasswordToRegular (True)";
_switchfrompasswordtoregular(__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 411;BA.debugLine="SwitchFromPasswordToRegular(False)";
_switchfrompasswordtoregular(__c.False);
 break; }
case 3: {
 //BA.debugLineNum = 413;BA.debugLine="tf_EnterPressed";
_tf_enterpressed();
 //BA.debugLineNum = 414;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (_mnexttextfield.IsInitialized /*boolean*/ ()==__c.False || (_mnexttextfield).equals((b4a.example.b4xfloattextfield)(this))) { 
 //BA.debugLineNum = 416;BA.debugLine="IME.HideKeyboard";
_ime.HideKeyboard(ba);
 };
 break; }
}
;
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return "";
}
public String  _requestfocusandshowkeyboard() throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
 //BA.debugLineNum = 451;BA.debugLine="mTextField.RequestFocus";
_mtextfield.RequestFocus();
 //BA.debugLineNum = 453;BA.debugLine="IME.ShowKeyboard(mTextField)";
_ime.ShowKeyboard((android.view.View)(_mtextfield.getObject()));
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return "";
}
public String  _setnextfield(b4a.example.b4xfloattextfield _field) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
Object _o = null;
 //BA.debugLineNum = 299;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
 //BA.debugLineNum = 300;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 302;BA.debugLine="If Multiline = False Then";
if (_multiline==__c.False) { 
 //BA.debugLineNum = 303;BA.debugLine="If Field <> Me Then";
if ((_field).equals((b4a.example.b4xfloattextfield)(this)) == false) { 
 //BA.debugLineNum = 304;BA.debugLine="IME.AddHandleActionEvent(mTextField)";
_ime.AddHandleActionEvent((android.widget.EditText)(_mtextfield.getObject()),ba);
 };
 //BA.debugLineNum = 306;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_mtextfield.getObject()));
 //BA.debugLineNum = 307;BA.debugLine="et.ForceDoneButton = True";
_et.setForceDoneButton(__c.True);
 };
 //BA.debugLineNum = 310;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
 //BA.debugLineNum = 311;BA.debugLine="mNextTextField = o";
_mnexttextfield = (b4a.example.b4xfloattextfield)(_o);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _s) throws Exception{
String _old = "";
 //BA.debugLineNum = 392;BA.debugLine="Public Sub setText(s As String)";
 //BA.debugLineNum = 393;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = _mtextfield.getText();
 //BA.debugLineNum = 394;BA.debugLine="mTextField.Text = s";
_mtextfield.setText(BA.ObjectToCharSequence(_s));
 //BA.debugLineNum = 396;BA.debugLine="If IsPaused(Me) Then tf_TextChanged(old, s)";
if (__c.IsPaused(ba,this)) { 
_tf_textchanged(_old,_s);};
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return "";
}
public void  _switchfrompasswordtoregular(boolean _toregular) throws Exception{
ResumableSub_SwitchFromPasswordToRegular rsub = new ResumableSub_SwitchFromPasswordToRegular(this,_toregular);
rsub.resume(ba, null);
}
public static class ResumableSub_SwitchFromPasswordToRegular extends BA.ResumableSub {
public ResumableSub_SwitchFromPasswordToRegular(b4a.example.b4xfloattextfield parent,boolean _toregular) {
this.parent = parent;
this._toregular = _toregular;
}
b4a.example.b4xfloattextfield parent;
boolean _toregular;
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _oldfield = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 138;BA.debugLine="Dim text As String = mTextField.Text";
_text = parent._mtextfield.getText();
 //BA.debugLineNum = 139;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = parent._mtextfield.getTextColor();
 //BA.debugLineNum = 140;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = parent._mtextfield.getFont();
 //BA.debugLineNum = 141;BA.debugLine="Dim oldfield As B4XView = mTextField";
_oldfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
_oldfield = parent._mtextfield;
 //BA.debugLineNum = 143;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
parent._createtextfieldall(parent.__c.Not(_toregular),_font1,_textcolor);
 //BA.debugLineNum = 144;BA.debugLine="mTextField.Text = text";
parent._mtextfield.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 145;BA.debugLine="If lblClear.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._lblclear.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 146;BA.debugLine="If ToRegular = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_toregular==parent.__c.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 147;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
parent._lblclear.setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f4))));
 //BA.debugLineNum = 148;BA.debugLine="lblClear.Tag = \"reveal\"";
parent._lblclear.setTag((Object)("reveal"));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 150;BA.debugLine="lblClear.Tag = \"hide\"";
parent._lblclear.setTag((Object)("hide"));
 //BA.debugLineNum = 151;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
parent._lblclear.setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f5))));
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 153;BA.debugLine="lblClear.BringToFront";
parent._lblclear.BringToFront();
 if (true) break;
;
 //BA.debugLineNum = 155;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";

case 10:
//if
this.state = 15;
if (parent._lblv.IsInitialized()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
parent._lblv.BringToFront();
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 156;BA.debugLine="HintImageView.BringToFront";
parent._hintimageview.BringToFront();
 //BA.debugLineNum = 157;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
parent._base_resize(parent._mbase.getWidth(),parent._mbase.getHeight());
 //BA.debugLineNum = 162;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(parent._mtextfield.getObject()));
 //BA.debugLineNum = 163;BA.debugLine="et.SelectionStart = mTextField.Text.Length";
_et.setSelectionStart(parent._mtextfield.getText().length());
 //BA.debugLineNum = 165;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now";
parent._lastswitchtextfieldtime = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 166;BA.debugLine="mTextField.RequestFocus";
parent._mtextfield.RequestFocus();
 //BA.debugLineNum = 167;BA.debugLine="oldfield.RemoveViewFromParent";
_oldfield.RemoveViewFromParent();
 //BA.debugLineNum = 169;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now + 200";
parent._lastswitchtextfieldtime = (long) (parent.__c.DateTime.getNow()+200);
 //BA.debugLineNum = 170;BA.debugLine="et.Enabled = False";
_et.setEnabled(parent.__c.False);
 //BA.debugLineNum = 171;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
 //BA.debugLineNum = 172;BA.debugLine="et.Enabled = True";
_et.setEnabled(parent.__c.True);
 //BA.debugLineNum = 173;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 //BA.debugLineNum = 174;BA.debugLine="et.RequestFocus";
_et.RequestFocus();
 //BA.debugLineNum = 175;BA.debugLine="IME.ShowKeyboard(mTextField)";
parent._ime.ShowKeyboard((android.view.View)(parent._mtextfield.getObject()));
 //BA.debugLineNum = 177;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Passwo";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_PasswordRevealChanged",(int) (1))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 178;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Passwo";
parent.__c.CallSubDelayed2(ba,parent._mcallback,parent._meventname+"_PasswordRevealChanged",(Object)(_toregular));
 if (true) break;

case 19:
//C
this.state = -1;
;
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tf_action() throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Private Sub tf_Action";
 //BA.debugLineNum = 278;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (_mnexttextfield.IsInitialized /*boolean*/ () && (_mnexttextfield).equals((b4a.example.b4xfloattextfield)(this)) == false) { 
 //BA.debugLineNum = 279;BA.debugLine="mNextTextField.TextField.RequestFocus";
_mnexttextfield._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().RequestFocus();
 };
 //BA.debugLineNum = 281;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (_xui.SubExists(ba,_mcallback,_meventname+"_EnterPressed",(int) (0))) { 
 //BA.debugLineNum = 282;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_EnterPressed");
 };
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit() throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Private Sub tf_BeginEdit";
 //BA.debugLineNum = 270;BA.debugLine="tf_FocusChanged(True)";
_tf_focuschanged(__c.True);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit() throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Private Sub tf_EndEdit";
 //BA.debugLineNum = 274;BA.debugLine="tf_FocusChanged(False)";
_tf_focuschanged(__c.False);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _tf_enterpressed() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Private Sub tf_EnterPressed";
 //BA.debugLineNum = 321;BA.debugLine="tf_Action";
_tf_action();
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
 //BA.debugLineNum = 235;BA.debugLine="Focused = HasFocus";
_focused = _hasfocus;
 //BA.debugLineNum = 236;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_updatelabel(_mtextfield.getText(),__c.True);
 //BA.debugLineNum = 237;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_FocusC";
if (_xui.SubExists(ba,_mcallback,_meventname+"_FocusChanged",(int) (1))) { 
 //BA.debugLineNum = 238;BA.debugLine="If LastSwitchTextFieldTime + 100 < DateTime.Now";
if (_lastswitchtextfieldtime+100<__c.DateTime.getNow()) { 
 //BA.debugLineNum = 239;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Focus";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_FocusChanged",(Object)(_focused));
 };
 };
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
 //BA.debugLineNum = 288;BA.debugLine="UpdateLabel(New, False)";
_updatelabel(_new,__c.False);
 //BA.debugLineNum = 289;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (_xui.SubExists(ba,_mcallback,_meventname+"_TextChanged",(int) (2)) && _mtextfield.IsInitialized()) { 
 //BA.debugLineNum = 290;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,_mcallback,_meventname+"_TextChanged",(Object)(_old),(Object)(_new));
 };
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 245;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 246;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = _xui.CreateFont2(_hintfont,_largelabeltextsize);
 //BA.debugLineNum = 247;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = _measuringcanvas.MeasureText(_hinttext,_f);
 //BA.debugLineNum = 248;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
_largefocused = _createbitmap(_r,_hintcolor,_f);
 //BA.debugLineNum = 249;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
_largenotfocused = _createbitmap(_r,_nonfocusedhintcolor,_f);
 //BA.debugLineNum = 250;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = _xui.CreateFont2(_hintfont,_smalllabeltextsize);
 //BA.debugLineNum = 251;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = _measuringcanvas.MeasureText(_hinttext,_f);
 //BA.debugLineNum = 252;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
_smallfocused = _createbitmap(_r,_hintcolor,_f);
 //BA.debugLineNum = 253;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
_smallnotfocused = _createbitmap(_r,_nonfocusedhintcolor,_f);
 //BA.debugLineNum = 254;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_updatelabel(_mtextfield.getText(),__c.True);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _updatelabel(String _txt,boolean _force) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 210;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
 //BA.debugLineNum = 211;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{_lblclear,_lblv};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
 //BA.debugLineNum = 212;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(_focused && _txt.length()>0);};
 }
};
 //BA.debugLineNum = 215;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
 //BA.debugLineNum = 216;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==_largelabel && _force==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 217;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 218;BA.debugLine="If Focused Then";
if (_focused) { 
 //BA.debugLineNum = 219;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = _largefocused;}
else {
_b = _smallfocused;};
 }else {
 //BA.debugLineNum = 221;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = _largenotfocused;}
else {
_b = _smallnotfocused;};
 };
 //BA.debugLineNum = 223;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 224;BA.debugLine="HintImageView.SetBitmap(b)";
_hintimageview.SetBitmap((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 225;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
 //BA.debugLineNum = 226;BA.debugLine="HintImageView.SetLayoutAnimated (AnimationDurati";
_hintimageview.SetLayoutAnimated(_animationduration,_hintlabellargeoffsetx,(int) (_mbase.getHeight()/(double)2-_b.getHeight()/(double)2),(int) (_b.getWidth()),(int) (_b.getHeight()));
 //BA.debugLineNum = 227;BA.debugLine="LargeLabel = True";
_largelabel = __c.True;
 }else {
 //BA.debugLineNum = 229;BA.debugLine="HintImageView.SetLayoutAnimated(AnimationDuratio";
_hintimageview.SetLayoutAnimated(_animationduration,_hintlabelsmalloffsetx,_hintlabelsmalloffsety,(int) (_b.getWidth()),(int) (_b.getHeight()));
 //BA.debugLineNum = 230;BA.debugLine="LargeLabel = False";
_largelabel = __c.False;
 };
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
