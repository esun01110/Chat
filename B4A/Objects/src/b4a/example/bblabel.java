package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bblabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.bblabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bblabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.List _runs = null;
public b4a.example.bctextengine._bcparagraphstyle _style = null;
public b4a.example.bctextengine _mtextengine = null;
public String _mtext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview = null;
public b4a.example.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4a.example.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _disableresizeevent = false;
public boolean _wordwrap = false;
public boolean _rtl = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 52;BA.debugLine="If DisableResizeEvent Then Return";
if (_disableresizeevent) { 
if (true) return "";};
 //BA.debugLineNum = 53;BA.debugLine="If Runs.IsInitialized Then";
if (_runs.IsInitialized()) { 
 //BA.debugLineNum = 54;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (_parsedata.NeedToReparseWhenResize /*boolean*/ ) { 
 //BA.debugLineNum = 55;BA.debugLine="ParseAndDraw";
_parseanddraw();
 }else {
 //BA.debugLineNum = 57;BA.debugLine="Redraw";
_redraw();
 };
 };
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 3;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 4;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4a.example.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 8;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.example.bctextengine();
 //BA.debugLineNum = 9;BA.debugLine="Private mText As String";
_mtext = "";
 //BA.debugLineNum = 10;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4a.example.bctextengine._bcparagraph();
 //BA.debugLineNum = 12;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 13;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4a.example.bbcodeparser._bbcodeparsedata();
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Public DisableResizeEvent As Boolean";
_disableresizeevent = false;
 //BA.debugLineNum = 16;BA.debugLine="Public WordWrap As Boolean = True";
_wordwrap = __c.True;
 //BA.debugLineNum = 17;BA.debugLine="Public RTL As Boolean";
_rtl = false;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 32;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 33;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 34;BA.debugLine="mBase.AddView(ForegroundImageView, 0, 0, mBase.Wi";
_mbase.AddView((android.view.View)(_foregroundimageview.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
_parsedata.DefaultColor /*int*/  = _xlbl.getTextColor();
 //BA.debugLineNum = 37;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
_parsedata.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
 //BA.debugLineNum = 38;BA.debugLine="ParseData.ViewsPanel = mBase";
_parsedata.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _mbase;
 //BA.debugLineNum = 39;BA.debugLine="mText = xlbl.Text";
_mtext = _xlbl.getText();
 //BA.debugLineNum = 44;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
_parsedata.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 82;BA.debugLine="Return mText";
if (true) return _mtext;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine  _gettextengine() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
 //BA.debugLineNum = 73;BA.debugLine="Return mTextEngine";
if (true) return _mtextengine;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 23;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="ForegroundImageView = iv";
_foregroundimageview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 26;BA.debugLine="ParseData.Initialize";
_parsedata.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="Padding.Initialize(2dip, 2dip, 2dip, 2dip)";
_padding.Initialize((float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.collections.List _pe = null;
 //BA.debugLineNum = 85;BA.debugLine="Public Sub ParseAndDraw";
 //BA.debugLineNum = 86;BA.debugLine="For i = mBase.NumberOfViews - 1 To 1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (_mbase.getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 87;BA.debugLine="mBase.GetView(i).RemoveViewFromParent";
_mbase.GetView(_i).RemoveViewFromParent();
 }
};
 //BA.debugLineNum = 89;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
_parsedata.NeedToReparseWhenResize /*boolean*/  = __c.False;
 //BA.debugLineNum = 90;BA.debugLine="ParseData.Text = mText";
_parsedata.Text /*String*/  = _mtext;
 //BA.debugLineNum = 91;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
_parsedata.Width /*int*/  = (int) ((_mbase.getWidth()-_padding.getLeft()-_padding.getRight()));
 //BA.debugLineNum = 92;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (_rtl) { 
_mtextengine._rtlaware /*boolean*/  = __c.True;};
 //BA.debugLineNum = 93;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = _mtextengine._tagparser /*b4a.example.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (_parsedata);
 //BA.debugLineNum = 94;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Parse";
_runs = _mtextengine._tagparser /*b4a.example.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (_pe,_parsedata);
 //BA.debugLineNum = 95;BA.debugLine="Redraw";
_redraw();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _redraw() throws Exception{
int _dx = 0;
int _dy = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 98;BA.debugLine="Public Sub Redraw";
 //BA.debugLineNum = 99;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = _mtextengine._createstyle /*b4a.example.bctextengine._bcparagraphstyle*/ ();
 //BA.debugLineNum = 100;BA.debugLine="Style.Padding = Padding";
_style.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = _padding;
 //BA.debugLineNum = 101;BA.debugLine="Style.MaxWidth = mBase.Width";
_style.MaxWidth /*int*/  = _mbase.getWidth();
 //BA.debugLineNum = 102;BA.debugLine="Style.HorizontalAlignment = \"left\"";
_style.HorizontalAlignment /*String*/  = "left";
 //BA.debugLineNum = 103;BA.debugLine="Style.WordWrap = WordWrap";
_style.WordWrap /*boolean*/  = _wordwrap;
 //BA.debugLineNum = 104;BA.debugLine="Style.RTL = RTL";
_style.RTL /*boolean*/  = _rtl;
 //BA.debugLineNum = 105;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, For";
_paragraph = _mtextengine._drawtext /*b4a.example.bctextengine._bcparagraph*/ (_runs,_style,_foregroundimageview,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null)));
 //BA.debugLineNum = 106;BA.debugLine="Dim dx As Int = mBase.Width / 2 - ForegroundImage";
_dx = (int) (_mbase.getWidth()/(double)2-_foregroundimageview.getWidth()/(double)2-_foregroundimageview.getLeft());
 //BA.debugLineNum = 107;BA.debugLine="Dim dy As Int = mBase.Height / 2 - ForegroundImag";
_dy = (int) (_mbase.getHeight()/(double)2-_foregroundimageview.getHeight()/(double)2-_foregroundimageview.getTop());
 //BA.debugLineNum = 108;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group10 = _mbase.GetAllViewsRecursive();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group10.Get(index10)));
 //BA.debugLineNum = 109;BA.debugLine="v.Left = v.Left + dx";
_v.setLeft((int) (_v.getLeft()+_dx));
 //BA.debugLineNum = 110;BA.debugLine="v.Top = v.Top + dy";
_v.setTop((int) (_v.getTop()+_dy));
 }
};
 //BA.debugLineNum = 112;BA.debugLine="ForegroundImageView.Visible = Paragraph.Height >";
_foregroundimageview.setVisible(_paragraph.Height /*int*/ >0);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _t) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub setText(t As String)";
 //BA.debugLineNum = 77;BA.debugLine="mText = t";
_mtext = _t;
 //BA.debugLineNum = 78;BA.debugLine="ParseAndDraw";
_parseanddraw();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4a.example.bctextengine _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
 //BA.debugLineNum = 63;BA.debugLine="mTextEngine = b";
_mtextengine = _b;
 //BA.debugLineNum = 67;BA.debugLine="If mText <> \"\" Then";
if ((_mtext).equals("") == false) { 
 //BA.debugLineNum = 68;BA.debugLine="setText(mText)";
_settext(_mtext);
 };
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SETTEXTENGINE"))
	return _settextengine((b4a.example.bctextengine) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
