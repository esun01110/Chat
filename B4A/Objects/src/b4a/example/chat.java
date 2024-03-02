package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class chat extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.chat");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.chat.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.b4xfloattextfield _textfield = null;
public b4a.example3.customlistview _clv = null;
public b4a.example.bbcodeview _bbcodeview1 = null;
public b4a.example.bctextengine _engine = null;
public b4a.example.bitmapcreator _bc = null;
public int _arrowwidth = 0;
public int _gap = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlbottom = null;
public boolean _lastuserleft = false;
public anywheresoftware.b4a.objects.LabelWrapper _lblsend = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _voice = null;
public anywheresoftware.b4a.objects.LabelWrapper _camera = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _additem(String _text,boolean _right) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _user = "";
anywheresoftware.b4a.objects.B4XViewWrapper _ivtext = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmptext = null;
int _textwidth = 0;
int _textheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _ivbg = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmpbg = null;
 //BA.debugLineNum = 53;BA.debugLine="Private Sub AddItem (Text As String, Right As Bool";
 //BA.debugLineNum = 54;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 55;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 56;BA.debugLine="Dim User As String";
_user = "";
 //BA.debugLineNum = 57;BA.debugLine="If Right Then User = \"you\" Else User = \"Bill gate";
if (_right) { 
_user = "you";}
else {
_user = "Bill gates";};
 //BA.debugLineNum = 58;BA.debugLine="BBCodeView1.ExternalRuns = BuildMessage(Text, Use";
_bbcodeview1._externalruns /*anywheresoftware.b4a.objects.collections.List*/  = _buildmessage(_text,_user);
 //BA.debugLineNum = 59;BA.debugLine="BBCodeView1.ParseAndDraw";
_bbcodeview1._parseanddraw /*String*/ ();
 //BA.debugLineNum = 60;BA.debugLine="Dim ivText As B4XView = CreateImageView";
_ivtext = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ivtext = _createimageview();
 //BA.debugLineNum = 62;BA.debugLine="Dim bmpText As B4XBitmap = GetBitmap(BBCodeView1.";
_bmptext = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmptext = _getbitmap((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_bbcodeview1._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())));
 //BA.debugLineNum = 64;BA.debugLine="Dim TextWidth As Int = bmpText.Width / Engine.mSc";
_textwidth = (int) (_bmptext.getWidth()/(double)_engine._mscale /*float*/ );
 //BA.debugLineNum = 65;BA.debugLine="Dim TextHeight As Int = bmpText.Height / Engine.m";
_textheight = (int) (_bmptext.getHeight()/(double)_engine._mscale /*float*/ );
 //BA.debugLineNum = 67;BA.debugLine="bc.SetBitmapToImageView(bmpText, ivText)";
_bc._setbitmaptoimageview(_bmptext,_ivtext);
 //BA.debugLineNum = 68;BA.debugLine="Dim ivBG As B4XView = CreateImageView";
_ivbg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ivbg = _createimageview();
 //BA.debugLineNum = 70;BA.debugLine="Dim bmpBG As B4XBitmap = DrawBubble(TextWidth, Te";
_bmpbg = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmpbg = _drawbubble(_textwidth,_textheight,_right);
 //BA.debugLineNum = 71;BA.debugLine="bc.SetBitmapToImageView(bmpBG, ivBG)";
_bc._setbitmaptoimageview(_bmpbg,_ivbg);
 //BA.debugLineNum = 72;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CLV.sv.ScrollViewCon";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_clv._sv.getScrollViewContentWidth()-__c.DipToCurrent((int) (2))),(int) (_textheight+3*_gap));
 //BA.debugLineNum = 73;BA.debugLine="If Right Then";
if (_right) { 
 //BA.debugLineNum = 74;BA.debugLine="p.AddView(ivBG, p.Width - bmpBG.Width * xui.Scal";
_p.AddView((android.view.View)(_ivbg.getObject()),(int) (_p.getWidth()-_bmpbg.getWidth()*_xui.getScale()),_gap,(int) (_bmpbg.getWidth()*_xui.getScale()),(int) (_bmpbg.getHeight()*_xui.getScale()));
 //BA.debugLineNum = 75;BA.debugLine="p.AddView(ivText, p.Width - Gap - ArrowWidth - T";
_p.AddView((android.view.View)(_ivtext.getObject()),(int) (_p.getWidth()-_gap-_arrowwidth-_textwidth),(int) (2*_gap),_textwidth,_textheight);
 }else {
 //BA.debugLineNum = 77;BA.debugLine="p.AddView(ivBG, 0, Gap, bmpBG.Width * xui.Scale,";
_p.AddView((android.view.View)(_ivbg.getObject()),(int) (0),_gap,(int) (_bmpbg.getWidth()*_xui.getScale()),(int) (_bmpbg.getHeight()*_xui.getScale()));
 //BA.debugLineNum = 78;BA.debugLine="p.AddView(ivText, Gap + ArrowWidth, 2 * Gap, Tex";
_p.AddView((android.view.View)(_ivtext.getObject()),(int) (_gap+_arrowwidth),(int) (2*_gap),_textwidth,_textheight);
 };
 //BA.debugLineNum = 80;BA.debugLine="CLV.Add(p, Null)";
_clv._add(_p,__c.Null);
 //BA.debugLineNum = 81;BA.debugLine="ScrollToLastItem";
_scrolltolastitem();
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _buildmessage(String _text,String _user) throws Exception{
b4a.example.bctextengine._bctextrun _title = null;
b4a.example.bctextengine._bctextrun _textrun = null;
b4a.example.bctextengine._bctextrun _time = null;
 //BA.debugLineNum = 129;BA.debugLine="Private Sub BuildMessage (Text As String, User As";
 //BA.debugLineNum = 130;BA.debugLine="Dim title As BCTextRun = Engine.CreateRun(User &";
_title = _engine._createrun /*b4a.example.bctextengine._bctextrun*/ (_user+__c.CRLF);
 //BA.debugLineNum = 131;BA.debugLine="title.TextFont  = BBCodeView1.ParseData.DefaultBo";
_title.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _bbcodeview1._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 132;BA.debugLine="Dim TextRun As BCTextRun = Engine.CreateRun(Text";
_textrun = _engine._createrun /*b4a.example.bctextengine._bctextrun*/ (_text+__c.CRLF);
 //BA.debugLineNum = 133;BA.debugLine="Dim time As BCTextRun = Engine.CreateRun(DateTime";
_time = _engine._createrun /*b4a.example.bctextengine._bctextrun*/ (__c.DateTime.Time(__c.DateTime.getNow()));
 //BA.debugLineNum = 134;BA.debugLine="time.TextFont = xui.CreateDefaultFont(8)";
_time.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont((float) (8));
 //BA.debugLineNum = 135;BA.debugLine="TextRun.TextColor = xui.Color_Black";
_textrun.TextColor /*int*/  = _xui.Color_Black;
 //BA.debugLineNum = 136;BA.debugLine="time.TextColor = xui.Color_Black";
_time.TextColor /*int*/  = _xui.Color_Black;
 //BA.debugLineNum = 137;BA.debugLine="Return Array(TextRun,time)";
if (true) return anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_textrun),(Object)(_time)});
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private TextField As B4XFloatTextField";
_textfield = new b4a.example.b4xfloattextfield();
 //BA.debugLineNum = 5;BA.debugLine="Private CLV As CustomListView";
_clv = new b4a.example3.customlistview();
 //BA.debugLineNum = 6;BA.debugLine="Private BBCodeView1 As BBCodeView";
_bbcodeview1 = new b4a.example.bbcodeview();
 //BA.debugLineNum = 7;BA.debugLine="Private Engine As BCTextEngine";
_engine = new b4a.example.bctextengine();
 //BA.debugLineNum = 8;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 9;BA.debugLine="Private ArrowWidth As Int = 10dip";
_arrowwidth = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 10;BA.debugLine="Private Gap As Int = 6dip";
_gap = __c.DipToCurrent((int) (6));
 //BA.debugLineNum = 11;BA.debugLine="Private pnlBottom As B4XView";
_pnlbottom = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private LastUserLeft As Boolean = True";
_lastuserleft = __c.True;
 //BA.debugLineNum = 13;BA.debugLine="Private lblSend As Label";
_lblsend = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private voice As Label";
_voice = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private camera As Label";
_camera = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _clv_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Private Sub CLV_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview() throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 155;BA.debugLine="Private Sub CreateImageView As B4XView";
 //BA.debugLineNum = 156;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 157;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 158;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _drawbubble(int _width,int _height,boolean _right) throws Exception{
int _scaledgap = 0;
int _nw = 0;
int _nh = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
b4a.example.bcpath _path = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 93;BA.debugLine="Private Sub DrawBubble (Width As Int, Height As In";
 //BA.debugLineNum = 95;BA.debugLine="Width = Ceil(Width / xui.Scale)";
_width = (int) (__c.Ceil(_width/(double)_xui.getScale()));
 //BA.debugLineNum = 96;BA.debugLine="Height = Ceil(Height / xui.Scale)";
_height = (int) (__c.Ceil(_height/(double)_xui.getScale()));
 //BA.debugLineNum = 97;BA.debugLine="Dim ScaledGap As Int = Ceil(Gap / xui.Scale)";
_scaledgap = (int) (__c.Ceil(_gap/(double)_xui.getScale()));
 //BA.debugLineNum = 98;BA.debugLine="Dim nw As Int = Width + 2 * ScaledGap + 15";
_nw = (int) (_width+2*_scaledgap+15);
 //BA.debugLineNum = 99;BA.debugLine="Dim nh As Int = Height + 2 * ScaledGap";
_nh = (int) (_height+2*_scaledgap);
 //BA.debugLineNum = 100;BA.debugLine="If bc.mWidth < nw Or bc.mHeight < nh Then";
if (_bc._mwidth<_nw || _bc._mheight<_nh) { 
 //BA.debugLineNum = 101;BA.debugLine="bc.Initialize(Max(bc.mWidth, nw), Max(bc.mHeight";
_bc._initialize(ba,(int) (__c.Max(_bc._mwidth,_nw)),(int) (__c.Max(_bc._mheight,_nh)));
 };
 //BA.debugLineNum = 103;BA.debugLine="bc.DrawRect(bc.TargetRect, xui.Color_Transparent,";
_bc._drawrect(_bc._targetrect,_xui.Color_Transparent,__c.True,(int) (0));
 //BA.debugLineNum = 104;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 105;BA.debugLine="Dim path As BCPath";
_path = new b4a.example.bcpath();
 //BA.debugLineNum = 106;BA.debugLine="Dim clr As Int";
_clr = 0;
 //BA.debugLineNum = 107;BA.debugLine="If Right Then clr = 0xCA6C5CF0 Else clr = 0xFFEFE";
if (_right) { 
_clr = ((int)0xca6c5cf0);}
else {
_clr = ((int)0xffefefef);};
 //BA.debugLineNum = 108;BA.debugLine="If Right Then";
if (_right) { 
 //BA.debugLineNum = 109;BA.debugLine="r.Initialize(ScaledGap, 0, nw, nh)";
_r.Initialize((float) (_scaledgap),(float) (0),(float) (_nw),(float) (_nh));
 //BA.debugLineNum = 110;BA.debugLine="path.Initialize(nw - 1, 1)";
_path._initialize(ba,(float) (_nw-1),(float) (1));
 //BA.debugLineNum = 112;BA.debugLine="path.LineTo(nw - 1, 10)";
_path._lineto((float) (_nw-1),(float) (10));
 //BA.debugLineNum = 113;BA.debugLine="path.LineTo(nw - 1 - 10, 1)";
_path._lineto((float) (_nw-1-10),(float) (1));
 //BA.debugLineNum = 114;BA.debugLine="path.LineTo(nw - 1, 1)";
_path._lineto((float) (_nw-1),(float) (1));
 }else {
 //BA.debugLineNum = 116;BA.debugLine="r.Initialize(ScaledGap, 0, nw, nh)";
_r.Initialize((float) (_scaledgap),(float) (0),(float) (_nw),(float) (_nh));
 //BA.debugLineNum = 117;BA.debugLine="path.Initialize(nw  + 1, 1)";
_path._initialize(ba,(float) (_nw+1),(float) (1));
 //BA.debugLineNum = 118;BA.debugLine="path.LineTo(nw + 1 + 10, 1)";
_path._lineto((float) (_nw+1+10),(float) (1));
 //BA.debugLineNum = 119;BA.debugLine="path.LineTo(nw + 1 , 10)";
_path._lineto((float) (_nw+1),(float) (10));
 //BA.debugLineNum = 120;BA.debugLine="path.LineTo(nw + 1, 1)";
_path._lineto((float) (_nw+1),(float) (1));
 };
 //BA.debugLineNum = 122;BA.debugLine="bc.DrawRectRounded(r, clr, True, 0, 15)' Use half";
_bc._drawrectrounded(_r,_clr,__c.True,(int) (0),(int) (15));
 //BA.debugLineNum = 123;BA.debugLine="bc.DrawPath(path, clr, True, 0)";
_bc._drawpath(_path,_clr,__c.True,(int) (0));
 //BA.debugLineNum = 124;BA.debugLine="bc.DrawPath(path, clr, False, 2)";
_bc._drawpath(_path,_clr,__c.False,(int) (2));
 //BA.debugLineNum = 125;BA.debugLine="Dim b As B4XBitmap = bc.Bitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _bc._getbitmap();
 //BA.debugLineNum = 126;BA.debugLine="Return b.Crop(0, 0, nw, nh)";
if (true) return _b.Crop((int) (0),(int) (0),_nw,_nh);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(anywheresoftware.b4a.objects.ImageViewWrapper _iv) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Private Sub GetBitmap (iv As ImageView) As B4XBitm";
 //BA.debugLineNum = 144;BA.debugLine="Return iv.Bitmap";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_iv.getBitmap()));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public String  _heightchanged(int _newheight) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
 //BA.debugLineNum = 45;BA.debugLine="Public Sub HeightChanged (NewHeight As Int)";
 //BA.debugLineNum = 46;BA.debugLine="Dim c As B4XView = CLV.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = _clv._asview();
 //BA.debugLineNum = 47;BA.debugLine="c.Height = NewHeight - pnlBottom.Height";
_c.setHeight((int) (_newheight-_pnlbottom.getHeight()));
 //BA.debugLineNum = 48;BA.debugLine="CLV.Base_Resize(c.Width, c.Height)";
_clv._base_resize(_c.getWidth(),_c.getHeight());
 //BA.debugLineNum = 49;BA.debugLine="pnlBottom.Top = NewHeight - pnlBottom.Height";
_pnlbottom.setTop((int) (_newheight-_pnlbottom.getHeight()));
 //BA.debugLineNum = 50;BA.debugLine="ScrollToLastItem";
_scrolltolastitem();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
 //BA.debugLineNum = 20;BA.debugLine="Parent.LoadLayout(\"1\")";
_parent.LoadLayout("1",ba);
 //BA.debugLineNum = 21;BA.debugLine="Engine.Initialize(Parent)";
_engine._initialize /*String*/ (ba,_parent);
 //BA.debugLineNum = 22;BA.debugLine="bc.Initialize(300, 300)";
_bc._initialize(ba,(int) (300),(int) (300));
 //BA.debugLineNum = 23;BA.debugLine="TextField.NextField = TextField";
_textfield._setnextfield /*b4a.example.b4xfloattextfield*/ (_textfield);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _lblsend_click() throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
 //BA.debugLineNum = 26;BA.debugLine="Private Sub lblSend_Click";
 //BA.debugLineNum = 27;BA.debugLine="If TextField.Text.Length > 0 Then";
if (_textfield._gettext /*String*/ ().length()>0) { 
 //BA.debugLineNum = 28;BA.debugLine="LastUserLeft = Not(LastUserLeft)";
_lastuserleft = __c.Not(_lastuserleft);
 //BA.debugLineNum = 29;BA.debugLine="AddItem(TextField.Text, LastUserLeft)";
_additem(_textfield._gettext /*String*/ (),_lastuserleft);
 };
 //BA.debugLineNum = 31;BA.debugLine="TextField.RequestFocusAndShowKeyboard";
_textfield._requestfocusandshowkeyboard /*String*/ ();
 //BA.debugLineNum = 36;BA.debugLine="Dim et As EditText = TextField.TextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_textfield._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getObject()));
 //BA.debugLineNum = 37;BA.debugLine="et.SelectAll";
_et.SelectAll();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public void  _scrolltolastitem() throws Exception{
ResumableSub_ScrollToLastItem rsub = new ResumableSub_ScrollToLastItem(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ScrollToLastItem extends BA.ResumableSub {
public ResumableSub_ScrollToLastItem(b4a.example.chat parent) {
this.parent = parent;
}
b4a.example.chat parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 85;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 //BA.debugLineNum = 86;BA.debugLine="If CLV.Size > 0 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._clv._getsize()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 87;BA.debugLine="If CLV.sv.ScrollViewContentHeight > CLV.sv.Heigh";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._clv._sv.getScrollViewContentHeight()>parent._clv._sv.getHeight()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 88;BA.debugLine="CLV.ScrollToItem(CLV.Size - 1)";
parent._clv._scrolltoitem((int) (parent._clv._getsize()-1));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
