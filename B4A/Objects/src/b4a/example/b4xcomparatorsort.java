package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcomparatorsort extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xcomparatorsort");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xcomparatorsort.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 4;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public int  _partition(anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,int _pivotindex,Object _comparator) throws Exception{
Object _pivotvalue = null;
int _l = 0;
int _i = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private Sub Partition(Data As List, StartIndex As";
 //BA.debugLineNum = 31;BA.debugLine="Dim PivotValue As Object = Data.Get(StartIndex +";
_pivotvalue = _data.Get((int) (_startindex+_pivotindex));
 //BA.debugLineNum = 32;BA.debugLine="Swap(Data, StartIndex, PivotIndex, Length - 1)";
_swap(_data,_startindex,_pivotindex,(int) (_length-1));
 //BA.debugLineNum = 33;BA.debugLine="Dim L As Int = 0";
_l = (int) (0);
 //BA.debugLineNum = 34;BA.debugLine="For i = 0 To Length - 2";
{
final int step4 = 1;
final int limit4 = (int) (_length-2);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 35;BA.debugLine="If CallSub3(Comparator, \"Compare\", Data.Get(Star";
if (((int)(BA.ObjectToNumber(__c.CallSubNew3(ba,_comparator,"Compare",_data.Get((int) (_startindex+_i)),_pivotvalue))))<0) { 
 //BA.debugLineNum = 36;BA.debugLine="L = L + 1";
_l = (int) (_l+1);
 //BA.debugLineNum = 37;BA.debugLine="Swap(Data, StartIndex, L - 1, i)";
_swap(_data,_startindex,(int) (_l-1),_i);
 };
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Swap(Data, StartIndex, Length - 1, L)";
_swap(_data,_startindex,(int) (_length-1),_l);
 //BA.debugLineNum = 41;BA.debugLine="Return L";
if (true) return _l;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return 0;
}
public String  _quicksort(anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,Object _comparator) throws Exception{
int _pivotindex = 0;
int _r = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private Sub QuickSort (Data As List, StartIndex As";
 //BA.debugLineNum = 22;BA.debugLine="If Length > 1 Then";
if (_length>1) { 
 //BA.debugLineNum = 23;BA.debugLine="Dim PivotIndex As Int = Rnd(0, Length)";
_pivotindex = __c.Rnd((int) (0),_length);
 //BA.debugLineNum = 24;BA.debugLine="Dim r As Int = Partition(Data, StartIndex, Lengt";
_r = _partition(_data,_startindex,_length,_pivotindex,_comparator);
 //BA.debugLineNum = 25;BA.debugLine="QuickSort(Data, StartIndex, r, Comparator)";
_quicksort(_data,_startindex,_r,_comparator);
 //BA.debugLineNum = 26;BA.debugLine="QuickSort(Data, StartIndex + r + 1, Length - r -";
_quicksort(_data,(int) (_startindex+_r+1),(int) (_length-_r-1),_comparator);
 };
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _sort(anywheresoftware.b4a.objects.collections.List _data,Object _comparator) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Sort (Data As List, Comparator As Objec";
 //BA.debugLineNum = 14;BA.debugLine="QuickSort(Data, 0, Data.Size, Comparator)";
_quicksort(_data,(int) (0),_data.getSize(),_comparator);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _swap(anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _i1,int _i2) throws Exception{
Object _o = null;
 //BA.debugLineNum = 44;BA.debugLine="Private Sub Swap (Data As List, StartIndex As Int,";
 //BA.debugLineNum = 45;BA.debugLine="Dim o As Object = Data.Get(StartIndex + i1)";
_o = _data.Get((int) (_startindex+_i1));
 //BA.debugLineNum = 46;BA.debugLine="Data.Set(StartIndex + i1, Data.Get(StartIndex + i";
_data.Set((int) (_startindex+_i1),_data.Get((int) (_startindex+_i2)));
 //BA.debugLineNum = 47;BA.debugLine="Data.Set(StartIndex + i2, o)";
_data.Set((int) (_startindex+_i2),_o);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
