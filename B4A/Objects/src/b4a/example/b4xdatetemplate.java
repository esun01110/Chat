package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdatetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xdatetemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xdatetemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _month = 0;
public int _year = 0;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _tempselectedday = 0;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanebg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanefg = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvsbackground = null;
public long _selecteddate = 0L;
public long _previousselecteddate = 0L;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public int _highlightedcolor = 0;
public int _selectedcolor = 0;
public int _daysinmonthcolor = 0;
public int _daysinweekcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvsdays = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _daystitlespane = null;
public int _firstday = 0;
public int _minyear = 0;
public int _maxyear = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblyear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnldialog = null;
public anywheresoftware.b4a.objects.collections.List _months = null;
public b4a.example.b4xdialog _mdialog = null;
public boolean _closeonselection = false;
public anywheresoftware.b4a.objects.collections.List _daysofweeknames = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _btnmonth_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _m = 0;
 //BA.debugLineNum = 160;BA.debugLine="Private Sub btnMonth_Click";
 //BA.debugLineNum = 161;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 162;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+_month-1+(double)(BA.ObjectToNumber(_btn.getTag())));
 //BA.debugLineNum = 163;BA.debugLine="month = (m Mod 12) + 1";
_month = (int) ((_m%12)+1);
 //BA.debugLineNum = 164;BA.debugLine="DrawDays";
_drawdays();
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
 //BA.debugLineNum = 154;BA.debugLine="Private Sub btnYear_Click";
 //BA.debugLineNum = 155;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 156;BA.debugLine="year = year + btn.Tag";
_year = (int) (_year+(double)(BA.ObjectToNumber(_btn.getTag())));
 //BA.debugLineNum = 157;BA.debugLine="DrawDays";
_drawdays();
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
 //BA.debugLineNum = 4;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
 //BA.debugLineNum = 5;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
 //BA.debugLineNum = 6;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 12;BA.debugLine="Private cvsBackground As B4XCanvas";
_cvsbackground = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 13;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Private PreviousSelectedDate As Long";
_previousselecteddate = 0L;
 //BA.debugLineNum = 15;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
 //BA.debugLineNum = 16;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_highlightedcolor = ((int)0xff001bbd);
 //BA.debugLineNum = 17;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_selectedcolor = ((int)0xff0ba29b);
 //BA.debugLineNum = 18;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_daysinmonthcolor = _xui.Color_White;
 //BA.debugLineNum = 19;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_daysinweekcolor = _xui.Color_Gray;
 //BA.debugLineNum = 20;BA.debugLine="Private cvsDays As B4XCanvas";
_cvsdays = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 21;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public FirstDay As Int = 0";
_firstday = (int) (0);
 //BA.debugLineNum = 23;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_minyear = (int) (1970);
_maxyear = (int) (2030);
 //BA.debugLineNum = 24;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private pnlDialog As B4XView";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private months As List";
_months = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 32;BA.debugLine="Private mDialog As B4XDialog";
_mdialog = new b4a.example.b4xdialog();
 //BA.debugLineNum = 33;BA.debugLine="Public CloseOnSelection As Boolean = True";
_closeonselection = __c.True;
 //BA.debugLineNum = 34;BA.debugLine="Public DaysOfWeekNames As List";
_daysofweeknames = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 167;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
 //BA.debugLineNum = 168;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _dayspanefg;
 //BA.debugLineNum = 169;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
_handlemouse(_x,_y,_action!=_p.TOUCH_ACTION_UP);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
 //BA.debugLineNum = 194;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=_xui.DialogResponse_Positive) { 
 //BA.debugLineNum = 195;BA.debugLine="setDate(PreviousSelectedDate)";
_setdate(_previousselecteddate);
 };
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 91;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
 //BA.debugLineNum = 92;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 93;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*_boxw),(float) (_y*_boxh),(float) (_x*_boxw+_boxw),(float) (_y*_boxh+_boxh));
 //BA.debugLineNum = 94;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _drawdays() throws Exception{
long _firstdayofmonth = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _day = 0;
int _row = 0;
 //BA.debugLineNum = 62;BA.debugLine="Private Sub DrawDays";
 //BA.debugLineNum = 63;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
_lblmonth.setText(BA.ObjectToCharSequence(_months.Get((int) (_month-1))));
 //BA.debugLineNum = 64;BA.debugLine="lblYear.Text = year";
_lblyear.setText(BA.ObjectToCharSequence(_year));
 //BA.debugLineNum = 65;BA.debugLine="SetYearsButtonState";
_setyearsbuttonstate();
 //BA.debugLineNum = 66;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_cvs.ClearRect(_cvs.getTargetRect());
 //BA.debugLineNum = 67;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
_cvsbackground.ClearRect(_cvsbackground.getTargetRect());
 //BA.debugLineNum = 68;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(ba,_year,_month,(int) (1))-1);
 //BA.debugLineNum = 69;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
_dayofweekoffset = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-_firstday)%7);
 //BA.debugLineNum = 70;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
_daysinmonth = _dateutils._numberofdaysinmonth(ba,_month,_year);
 //BA.debugLineNum = 71;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (_year==_selectedyear && _month==_selectedmonth) { 
 //BA.debugLineNum = 73;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
_drawbox(_cvs,_selectedcolor,(int) ((_selectedday-1+_dayofweekoffset)%7),(int) ((_selectedday-1+_dayofweekoffset)/(double)7));
 };
 //BA.debugLineNum = 76;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = _xui.CreateDefaultBoldFont((float) (14));
 //BA.debugLineNum = 77;BA.debugLine="For day = 1 To daysInMonth";
{
final int step13 = 1;
final int limit13 = _daysinmonth;
_day = (int) (1) ;
for (;_day <= limit13 ;_day = _day + step13 ) {
 //BA.debugLineNum = 78;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+_dayofweekoffset)/(double)7);
 //BA.debugLineNum = 79;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
_cvs.DrawText(ba,BA.NumberToString(_day),(float) ((((_dayofweekoffset+_day-1)%7)+0.5)*_boxw),(float) ((_row+0.5)*_boxh+_vcorrection),_daysfont,_daysinmonthcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
 //BA.debugLineNum = 82;BA.debugLine="cvsBackground.Invalidate";
_cvsbackground.Invalidate();
 //BA.debugLineNum = 83;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public long  _getdate() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub getDate As Long";
 //BA.debugLineNum = 99;BA.debugLine="Return selectedDate";
if (true) return _selecteddate;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 173;BA.debugLine="Return pnlDialog";
if (true) return _pnldialog;
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public String  _handlemouse(double _x,double _y,boolean _move) throws Exception{
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
 //BA.debugLineNum = 123;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
 //BA.debugLineNum = 124;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)_boxw);
_boxy = (int) (_y/(double)_boxh);
 //BA.debugLineNum = 125;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-_dayofweekoffset);
 //BA.debugLineNum = 126;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=_daysinmonth;
 //BA.debugLineNum = 127;BA.debugLine="If move Then";
if (_move) { 
 //BA.debugLineNum = 128;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==_tempselectedday) { 
if (true) return "";};
 //BA.debugLineNum = 129;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
_cvsbackground.ClearRect(_cvsbackground.getTargetRect());
 //BA.debugLineNum = 130;BA.debugLine="tempSelectedDay = newSelectedDay";
_tempselectedday = _newselectedday;
 //BA.debugLineNum = 131;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 132;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
_drawbox(_cvsbackground,_highlightedcolor,_boxx,_boxy);
 };
 }else {
 //BA.debugLineNum = 135;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
_cvsbackground.ClearRect(_cvsbackground.getTargetRect());
 //BA.debugLineNum = 136;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 137;BA.debugLine="SelectDay(newSelectedDay)";
_selectday(_newselectedday);
 //BA.debugLineNum = 138;BA.debugLine="If CloseOnSelection Then";
if (_closeonselection) { 
 //BA.debugLineNum = 139;BA.debugLine="Hide";
_hide();
 }else {
 //BA.debugLineNum = 141;BA.debugLine="DrawDays";
_drawdays();
 };
 };
 };
 //BA.debugLineNum = 146;BA.debugLine="cvsBackground.Invalidate";
_cvsbackground.Invalidate();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Private Sub Hide";
 //BA.debugLineNum = 150;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
_mdialog._close /*boolean*/ (_xui.DialogResponse_Positive);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 38;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
_pnldialog = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
_pnldialog.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 40;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
_pnldialog.LoadLayout("DateTemplate",ba);
 //BA.debugLineNum = 41;BA.debugLine="pnlDialog.Tag = Me";
_pnldialog.setTag(this);
 //BA.debugLineNum = 42;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
_month = __c.DateTime.GetMonth(__c.DateTime.getNow());
 //BA.debugLineNum = 43;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
_year = __c.DateTime.GetYear(__c.DateTime.getNow());
 //BA.debugLineNum = 44;BA.debugLine="months = DateUtils.GetMonthsNames";
_months = _dateutils._getmonthsnames(ba);
 //BA.debugLineNum = 45;BA.debugLine="selectedDate = DateTime.Now";
_selecteddate = __c.DateTime.getNow();
 //BA.debugLineNum = 46;BA.debugLine="setDate(selectedDate)";
_setdate(_selecteddate);
 //BA.debugLineNum = 47;BA.debugLine="cvs.Initialize(DaysPaneFg)";
_cvs.Initialize(_dayspanefg);
 //BA.debugLineNum = 48;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
_cvsbackground.Initialize(_dayspanebg);
 //BA.debugLineNum = 49;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
_boxw = (float) (_cvs.getTargetRect().getWidth()/(double)7);
 //BA.debugLineNum = 50;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
_boxh = (float) (_cvs.getTargetRect().getHeight()/(double)6);
 //BA.debugLineNum = 51;BA.debugLine="vCorrection = 5dip";
_vcorrection = (float) (__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 52;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
_cvsdays.Initialize(_daystitlespane);
 //BA.debugLineNum = 58;BA.debugLine="DaysOfWeekNames.Initialize";
_daysofweeknames.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="DaysOfWeekNames.AddAll(DateUtils.GetDaysNames)";
_daysofweeknames.AddAll(_dateutils._getdaysnames(ba));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _selectday(int _day) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub SelectDay(day As Int)";
 //BA.debugLineNum = 116;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
_selecteddate = _dateutils._setdate(ba,_year,_month,_day);
 //BA.debugLineNum = 117;BA.debugLine="selectedDay = day";
_selectedday = _day;
 //BA.debugLineNum = 118;BA.debugLine="selectedMonth = month";
_selectedmonth = _month;
 //BA.debugLineNum = 119;BA.debugLine="selectedYear = year";
_selectedyear = _year;
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setdate(long _date) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub setDate(date As Long)";
 //BA.debugLineNum = 104;BA.debugLine="If lblYear.IsInitialized = False Then";
if (_lblyear.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 105;BA.debugLine="selectedDate = date";
_selecteddate = _date;
 //BA.debugLineNum = 106;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
 //BA.debugLineNum = 108;BA.debugLine="year = DateTime.GetYear(date)";
_year = __c.DateTime.GetYear(_date);
 //BA.debugLineNum = 109;BA.debugLine="month = DateTime.GetMonth(date)";
_month = __c.DateTime.GetMonth(_date);
 //BA.debugLineNum = 110;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
_selectday(__c.DateTime.GetDayOfMonth(_date));
 //BA.debugLineNum = 111;BA.debugLine="lblYear.Text = year";
_lblyear.setText(BA.ObjectToCharSequence(_year));
 //BA.debugLineNum = 112;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
_lblmonth.setText(BA.ObjectToCharSequence(_months.Get((int) (_month-1))));
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _setyearsbuttonstate() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Private Sub SetYearsButtonState";
 //BA.debugLineNum = 87;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
_btnyearleft.setEnabled(_year>_minyear);
 //BA.debugLineNum = 88;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
_btnyearright.setEnabled(_year<_maxyear);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public void  _show(b4a.example.b4xdialog _dialog) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xdatetemplate parent,b4a.example.b4xdialog _dialog) {
this.parent = parent;
this._dialog = _dialog;
}
b4a.example.b4xdatetemplate parent;
b4a.example.b4xdialog _dialog;
anywheresoftware.b4a.objects.collections.List _days = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _i = 0;
String _d = "";
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 177;BA.debugLine="Dim days As List = DaysOfWeekNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = parent._daysofweeknames;
 //BA.debugLineNum = 178;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = parent._xui.CreateDefaultBoldFont((float) (14));
 //BA.debugLineNum = 179;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
parent._cvsdays.ClearRect(parent._cvsdays.getTargetRect());
 //BA.debugLineNum = 180;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
if (true) break;

case 1:
//for
this.state = 10;
step4 = 1;
limit4 = (int) (parent._firstday+7-1);
_i = parent._firstday ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 181;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
 //BA.debugLineNum = 182;BA.debugLine="If d.Length > 2 Then d = d.SubString2(0, 2)";
if (true) break;

case 4:
//if
this.state = 9;
if (_d.length()>2) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_d = _d.substring((int) (0),(int) (2));
if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 183;BA.debugLine="cvsDays.DrawText(d, (i - FirstDay + 0.5) * boxW,";
parent._cvsdays.DrawText(ba,_d,(float) ((_i-parent._firstday+0.5)*parent._boxw),(float) (parent.__c.DipToCurrent((int) (20))),_daysfont,parent._daysinweekcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 185;BA.debugLine="cvsDays.Invalidate";
parent._cvsdays.Invalidate();
 //BA.debugLineNum = 186;BA.debugLine="mDialog = Dialog";
parent._mdialog = _dialog;
 //BA.debugLineNum = 187;BA.debugLine="DrawDays";
parent._drawdays();
 //BA.debugLineNum = 188;BA.debugLine="PreviousSelectedDate = selectedDate";
parent._previousselecteddate = parent._selecteddate;
 //BA.debugLineNum = 189;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
 //BA.debugLineNum = 190;BA.debugLine="SetYearsButtonState";
parent._setyearsbuttonstate();
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((b4a.example.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
