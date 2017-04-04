package writeExcel;
//zapuskajem dwa konstructora z dataconfig to read excel
import lib.dataconfig;

public class ReadExcelData {

	public static void main(String[] args) {
		dataconfig excel = new dataconfig("C:\\Users\\vkoloyu\\test.xlsx");
		System.out.println (excel.getData(0, 0, 0));
	}

}
//select if data is at another column =IF(ISERROR(VLOOKUP(E9,'Project Overview'!M:M,1,FALSE)),"OUT","KEEP")
//custom formula to color row =$C:$C="Fixed"  color if line when word is present

=================================================================================
	
	/**
functionss1
@customFunction
*/

function FUU1 (args){
var total=0;
  for (var i=0; i<args.length; i++)  {total = total + parseInt(args[i]); }
  return total; }


/**
functionss2
@customFunction
*/

function FUU2 (args){
  if (args[2]>444) {
    return parseInt(args[7])+parseInt(args[11]);}

  else {return "args[2]<444"}


}

/**
functionss3
@customFunction
*/

function FUU3 (args){
  var myObj = args[4];
if(myObj=="17") {
    return "seventeen";
} else {
    return 1;
}


}
