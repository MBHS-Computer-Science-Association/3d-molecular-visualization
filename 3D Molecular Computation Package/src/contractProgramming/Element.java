package chemistry;
import java.util.ArrayList;


public class Element{
	
	
	public Element(){
		
	}
	
	public String[] getInfo(int atomicNum) {
		String[] name=new String[2];
		if(atomicNum>0&&atomicNum<110){
		
		switch(atomicNum){
			case 1:
				name[0]="H";
				name[1]= "1.01"  ;
			break;
			case 2:
				name[0]="He";
				name[1]=  "4.00" ;
			break;
			case 3:
				name[0]="Li";
				name[1]= "6.94"  ;
			break;
			case 4:
				name[0]="Be";
				name[1]=  "9.01" ;
			break;
			case 5:
				name[0]="B";
				name[1]=  "10.81" ;
			break;
			case 6:
				name[0]="C";
				name[1]= "12.01"  ;
			break;
			case 7:
				name[0]="N";
				name[1]=  "14.01" ;
			break;
			case 8:
				name[0]="O";
				name[1]= "16.00";
			break;
			case 9:
				name[0]="F";
				name[1]= "19.00";
			break;
			case 10:
				name[0]="Ne";
				name[1]= "20.18";
			break;
			case 11:
				name[0]="Na";
				name[1]= "22.99";
			break;
			case 12:
				name[0]="Mg";
				name[1]= "24.31";
			break;
			case 13:
				name[0]="Al";
				name[1]= "26.98";
			break;
			case 14:
				name[0]="Si";
				name[1]= "28.09";
			break;
			case 15:
				name[0]="P";
				name[1]= "30.97";
			break;
			case 16:
				name[0]="S";
				name[1]= "32.07";
			break;
			case 17:
				name[0]="Cl";
				name[1]= "35.45";
			break;
			case 18:
				name[0]="Ar";
				name[1]= "39.95";
			break;
			case 19:
				name[0]="K";
				name[1]= "39.10";
			break;
			case 20:
				name[0]="Ca";
				name[1]= "40.08";
			break;
			case 21:
				name[0]="Sc";
				name[1]= "44.96";
			break;
			case 22:
				name[0]="Ti";
				name[1]= "47.88";
			break;
			case 23:
				name[0]="V";
				name[1]= "50.94";
			break;
			case 24:
				name[0]="Cr";
				name[1]= "52.00";
			break;
			case 25:
				name[0]="Mn";
				name[1]= " 54.94";
			break;
			case 26:
				name[0]="Fe";
				name[1]= "55.85";
			break;
			case 27:
				name[0]="Co";
				name[1]= "58.93";
			break;
			case 28:
				name[0]="Ni";
				name[1]= "58.69";
			break;
			case 29:
				name[0]="Cu";
				name[1]= " 63.55";
			break;
			case 30:
				name[0]="Zn";
				name[1]= "65.39";
			break;
			case 31:
				name[0]="Ga";
				name[1]= "69.72";
			break;
			case 32:
				name[0]="Ge";
				name[1]= "72.61";
			break;
			case 33:
				name[0]="As";
				name[1]= "74.922";
			break;
			case 34:
				name[0]="Se";
				name[1]= "78.96";
			break;
			case 35:
				name[0]="Br";
				name[1]= "79.90";
			break;
			case 36:
				name[0]="Kr";
				name[1]= "83.80";
			break;
			case 37:
				name[0]="Rb";
				name[1]= "85.47";
			break;
			case 38:
				name[0]="Sr";
				name[1]= "87.62";
			break;
			case 39:
				name[0]="Y";
				name[1]= "88.91";
			break;
			case 40:
				name[0]="Zr";
				name[1]= "91.22";
			break;
			case 41:
				name[0]="Nb";
				name[1]= "92.91";
			break;
			case 42:
				name[0]="Mo";
				name[1]= "95.94";
			break;
			case 43:
				name[0]="Tc";
				name[1]= "98";
			break;
			case 44:
				name[0]="Ru";
				name[1]= "101.07";
			break;
			case 45:
				name[0]="Rh";
				name[1]= "102.91";
			break;
			case 46:
				name[0]="Pd";
				name[1]= "106.42";
			break;
			case 47:
				name[0]="Ag";
				name[1]= "107.87";
			break;
			case 48:
				name[0]="Cd";
				name[1]= "112.41";
			break;
			case 49:
				name[0]="In";
				name[1]= "114.82";
			break;
			case 50:
				name[0]="Sn";
				name[1]= "118.71";
			break;
			case 51:
				name[0]="Sb";
				name[1]= "121.76";
			break;
			case 52:
				name[0]="Te";
				name[1]= "127.60";
			break;
			case 53:
				name[0]="I";
				name[1]= "126.90";
			break;
			case 54:
				name[0]="Xe";
				name[1]= "131.29";
			break;
			case 55:
				name[0]="Cs";
				name[1]= "132.91";
			break;
			case 56:
				name[0]="Ba";
				name[1]= "137.33";
			break;
			case 57:
				name[0]="La";
				name[1]= "138.91";
			break;
			case 58:
				name[0]="Ce";
				name[1]= "140.12";
			break;
			case 59:
				name[0]="Pr";
				name[1]= "140.91";
			break;
			case 60:
				name[0]="Nd";
				name[1]= "144.24";
			break;
			case 61:
				name[0]="Pm";
				name[1]= "145";
			break;
			case 62:
				name[0]="Sm";
				name[1]= "150.36";
			break;
			case 63:
				name[0]="Eu";
				name[1]= "151.97";
			break;
			case 64:
				name[0]="Gd";
				name[1]= "157.25";
			break;
			case 65:
				name[0]="Tb";
				name[1]= "158.93";
			break;
			case 66:
				name[0]="Dy";
				name[1]= "162.50";
			break;
			case 67:
				name[0]="Ho";
				name[1]= "164.93";
			break;
			case 68:
				name[0]="Er";
				name[1]= "167.26";
			break;
			case 69:
				name[0]="Tm";
				name[1]= "168.93";
			break;
			case 70:
				name[0]="Yb";
				name[1]= "173.04";
			break;
			case 71:
				name[0]="Lu";
				name[1]= "174.97";
			break;
			case 72:
				name[0]="Hf";
				name[1]= "178.49";
			break;
			case 73:
				name[0]="Ta";
				name[1]= "180.95";
			break;
			case 74:
				name[0]="W";
				name[1]= "183.84";
			break;
			case 75:
				name[0]="Re";
				name[1]= "186.21";
			break;
			case 76:
				name[0]="Os";
				name[1]= "190.23";
			break;
			case 77:
				name[0]="Ir";
				name[1]= "192.22";
			break;
			case 78:
				name[0]="Pt";
				name[1]= "195.08";
			break;
			case 79:
				name[0]="Au";
				name[1]= "196.97";
			break;
			case 80:
				name[0]="Hg";
				name[1]= "200.59";
			break;
			case 81:
				name[0]="Tl";
				name[1]= "204.38";
			break;
			case 82:
				name[0]="Pb";
				name[1]= "207.2";
			break;
			case 83:
				name[0]="Bi";
				name[1]= "208.98";
			break;
			case 84:
				name[0]="Po";
				name[1]= "209";
			break;
			case 85:
				name[0]="At";
				name[1]= "210";
			break;
			case 86:
				name[0]="Rn";
				name[1]= "222";
			break;
			case 87:
				name[0]="Fr";
				name[1]= "223";
			break;
			case 88:
				name[0]="Ra";
				name[1]= "226.03";
			break;
			case 89:
				name[0]="Ac";
				name[1]= "227.03";
			break;
			case 90:
				name[0]="Th";
				name[1]= "232.04";
			break;
			case 91:
				name[0]="Pa";
				name[1]= "231.04";
			break;
			case 92:
				name[0]="U";
				name[1]= "238.03";
			break;
			case 93:
				name[0]="Np";
				name[1]= "237.05";
			break;
			case 94:
				name[0]="Pu";
				name[1]= "244";
			break;
			case 95:
				name[0]="Am";
				name[1]= "243";
			break;
			case 96:
				name[0]="Cm";
				name[1]= "247";
			break;
			case 97:
				name[0]="Bk";
				name[1]= "247";
			break;
			case 98:
				name[0]="Cf";
				name[1]= "251";
			break;
			case 99:
				name[0]="Es";
				name[1]= "252";
			break;
			case 100:
				name[0]="Fm";
				name[1]= "257";
			break;
			case 101:
				name[0]="Md";
				name[1]= "258";
			break;
			case 102:
				name[0]="No";
				name[1]= "259";
			break;
			case 103:
				name[0]="Lr";
				name[1]= "262";
			break;
			case 104:
				name[0]="Rf";
				name[1]= "261";
			break;
			case 105:
				name[0]="Db";
				name[1]= "262";
			break;
			case 106:
				name[0]="Sg";
				name[1]= "263";
			break;
			case 107:
				name[0]="Bh";
				name[1]= "262";
			break;
			case 108:
				name[0]="Hs";
				name[1]= "265";
			break;
			case 109:
				name[0]="Mt";
				name[1]= "266";
			break;
					}
		
	}else{
	name= null;	
	}
		return name;
	}
	
	
	public String[] getInfo(String symbol) {
		String[] name=new String[2];
		
		
		switch(symbol){
			case "h":
			case "H":
				name[0]="H";
				name[1]= "1.01"  ;
			break;
			case "he":
			case "He":
				name[0]="He";
				name[1]=  "4.00" ;
			break;
			case "Li":
			case "li":
				name[0]="Li";
				name[1]= "6.94"  ;
			break;
			case "be":
			case "Be":
				name[0]="Be";
				name[1]=  "9.01" ;
			break;
			case "b":
			case "B":
				name[0]="B";
				name[1]=  "10.81" ;
			break;
			case "C":
			case "c":
				name[0]="C";
				name[1]= "12.01"  ;
			break;
			case "N":
			case "n":
				name[0]="N";
				name[1]=  "14.01" ;
			break;
			case "O":
			case "o":
				name[0]="O";
				name[1]= "16.00";
			break;
			case "F":
			case "f":
				name[0]="F";
				name[1]= "19.00";
			break;
			case "Ne":
			case "ne":
				name[0]="Ne";
				name[1]= "20.18";
			break;
			case "Na":
			case "na":
				name[0]="Na";
				name[1]= "22.99";
			break;
			case "Mg":
			case "mg":
				name[0]="Mg";
				name[1]= "24.31";
			break;
			case "al":
			case "Al":
				name[0]="Al";
				name[1]= "26.98";
			break;
			case "Si":
			case "si":
				name[0]="Si";
				name[1]= "28.09";
			break;
			case "P":
			case "p":
				name[0]="P";
				name[1]= "30.97";
			break;
			case "S":
			case "s":
				name[0]="S";
				name[1]= "32.07";
			break;
			case "Cl":
			case "cl":
				name[0]="Cl";
				name[1]= "35.45";
			break;
			case "Ar":
			case "ar":
				name[0]="Ar";
				name[1]= "39.95";
			break;
			case "K":
			case "k":
				name[0]="K";
				name[1]= "39.10";
			break;
			case "Ca":
			case "ca":
				name[0]="Ca";
				name[1]= "40.08";
			break;
			case "Sc":
			case "sc":
				name[0]="Sc";
				name[1]= "44.96";
			break;
			case "Ti":
			case "ti":
				name[0]="Ti";
				name[1]= "47.88";
			break;
			case "V":
			case "v":
				name[0]="V";
				name[1]= "50.94";
			break;
			case "Cr":
			case "cr":
				name[0]="Cr";
				name[1]= "52.00";
			break;
			case "Mn":
			case "mn":
				name[0]="Mn";
				name[1]= " 54.94";
			break;
			case "Fe":
			case "fe":
				name[0]="Fe";
				name[1]= "55.85";
			break;
			case "Co":
			case "co":
				name[0]="Co";
				name[1]= "58.93";
			break;
			case "Ni":
			case "ni":
				name[0]="Ni";
				name[1]= "58.69";
			break;
			case "cu":
			case "Cu":
				name[0]="Cu";
				name[1]= " 63.55";
			break;
			case "Zn":
			case "zn":
				name[0]="Zn";
				name[1]= "65.39";
			break;
			case "Ga":
			case "ga":
				name[0]="Ga";
				name[1]= "69.72";
			break;
			case "Ge":
			case "ge":
				name[0]="Ge";
				name[1]= "72.61";
			break;
			case "As":
			case "as":
				name[0]="As";
				name[1]= "74.922";
			break;
			case "Se":
			case "se":
				name[0]="Se";
				name[1]= "78.96";
			break;
			case "Br":
			case "br":
				name[0]="Br";
				name[1]= "79.90";
			break;
			case "Kr":
			case "kr":
				name[0]="Kr";
				name[1]= "83.80";
			break;
			case "Rb":
			case "rb":
				name[0]="Rb";
				name[1]= "85.47";
			break;
			case "Sr":
			case "sr":
				name[0]="Sr";
				name[1]= "87.62";
			break;
			case "Y":
			case "y":
				name[0]="Y";
				name[1]= "88.91";
			break;
			case "Zr":
			case "zr":
				name[0]="Zr";
				name[1]= "91.22";
			break;
			case "Nb":
			case "nb":
				name[0]="Nb";
				name[1]= "92.91";
			break;
			case "Mo":
			case "mo":
				name[0]="Mo";
				name[1]= "95.94";
			break;
			case "Tc":
			case "tc":
				name[0]="Tc";
				name[1]= "98";
			break;
			case "Ru":
			case "ru":
				name[0]="Ru";
				name[1]= "101.07";
			break;
			case "Rh":
			case "rh":
				name[0]="Rh";
				name[1]= "102.91";
			break;
			case "Pd":
			case "pd":
				name[0]="Pd";
				name[1]= "106.42";
			break;
			case "Ag":
			case "ag":
				name[0]="Ag";
				name[1]= "107.87";
			break;
			case "Cd":
			case "cd":
				name[0]="Cd";
				name[1]= "112.41";
			break;
			case "In":
			case "in":
				name[0]="In";
				name[1]= "114.82";
			break;
			case "Sn":
			case "sn":
				name[0]="Sn";
				name[1]= "118.71";
			break;
			case "Sb":
			case "sb":
				name[0]="Sb";
				name[1]= "121.76";
			break;
			case "Te":
			case "te":
				name[0]="Te";
				name[1]= "127.60";
			break;
			case "I":
			case "i":
				name[0]="I";
				name[1]= "126.90";
			break;
			case "Xe":
			case "xe":
				name[0]="Xe";
				name[1]= "131.29";
			break;
			case "Cs":
			case "cs":
				name[0]="Cs";
				name[1]= "132.91";
			break;
			case "Ba":
			case "ba":
				name[0]="Ba";
				name[1]= "137.33";
			break;
			case "La":
			case "la":
				name[0]="La";
				name[1]= "138.91";
			break;
			case "Ce":
			case "ce":
				name[0]="Ce";
				name[1]= "140.12";
			break;
			case "Pr":
			case "pr":
				name[0]="Pr";
				name[1]= "140.91";
			break;
			case "Nd":
			case "nd":
				name[0]="Nd";
				name[1]= "144.24";
			break;
			case "Pm":
			case "pm":
				name[0]="Pm";
				name[1]= "145";
			break;
			case "Sm":
			case "sm":
				name[0]="Sm";
				name[1]= "150.36";
			break;
			case "Eu":
			case "eu":
				name[0]="Eu";
				name[1]= "151.97";
			break;
			case "Gd":
			case "gd":
				name[0]="Gd";
				name[1]= "157.25";
			break;
			case "Tb":
			case "tb":
				name[0]="Tb";
				name[1]= "158.93";
			break;
			case "dy":
			case "Dy":
				name[0]="Dy";
				name[1]= "162.50";
			break;
			case "Ho":
			case "ho":
				name[0]="Ho";
				name[1]= "164.93";
			break;
			case "Er":
			case "er":
				name[0]="Er";
				name[1]= "167.26";
			break;
			case "Tm":
			case "tm":
				name[0]="Tm";
				name[1]= "168.93";
			break;
			case "Yb":
			case "yb":
				name[0]="Yb";
				name[1]= "173.04";
			break;
			case "Lu":
			case "lu":
				name[0]="Lu";
				name[1]= "174.97";
			break;
			case "Hf":
			case "hf":
				name[0]="Hf";
				name[1]= "178.49";
			break;
			case "Ta":
			case "ta":
				name[0]="Ta";
				name[1]= "180.95";
			break;
			case "w":
			case "W":
				name[0]="W";
				name[1]= "183.84";
			break;
			case "Re":
			case "re":
				name[0]="Re";
				name[1]= "186.21";
			break;
			case "Os":
			case "os":
				name[0]="Os";
				name[1]= "190.23";
			break;
			case "Ir":
			case "ir":
				name[0]="Ir";
				name[1]= "192.22";
			break;
			case "Pt":
			case "pt":
				name[0]="Pt";
				name[1]= "195.08";
			break;
			case "Au":
			case "au":
				name[0]="Au";
				name[1]= "196.97";
			break;
			case "hg":
			case "Hg":
				name[0]="Hg";
				name[1]= "200.59";
			break;
			case "tl":
			case "Tl":
				name[0]="Tl";
				name[1]= "204.38";
			break;
			case "Pb":
			case "pb":
				name[0]="Pb";
				name[1]= "207.2";
			break;
			case "Bi":
			case "bi":
				name[0]="Bi";
				name[1]= "208.98";
			break;
			case "Po":
			case "po":
				name[0]="Po";
				name[1]= "209";
			break;
			case "At":
			case "at":
				name[0]="At";
				name[1]= "210";
			break;
			case "Rn":
			case "rn":
				name[0]="Rn";
				name[1]= "222";
			break;
			case "Fr":
			case "fr":
				name[0]="Fr";
				name[1]= "223";
			break;
			case "Ra":
			case "ra":
				name[0]="Ra";
				name[1]= "226.03";
			break;
			case "Ac":
			case "ac":
				name[0]="Ac";
				name[1]= "227.03";
			break;
			case "Th":
			case "th":
				name[0]="Th";
				name[1]= "232.04";
			break;
			case "Pa":
			case "pa":
				name[0]="Pa";
				name[1]= "231.04";
			break;
			case "U":
			case "u":
				name[0]="U";
				name[1]= "238.03";
			break;
			case "Np":
			case "np":
				name[0]="Np";
				name[1]= "237.05";
			break;
			case "pu":
			case "Pu":
				name[0]="Pu";
				name[1]= "244";
			break;
			case "Am":
			case "am":
				name[0]="Am";
				name[1]= "243";
			break;
			case "Cm":
			case "cm":
				name[0]="Cm";
				name[1]= "247";
			break;
			case "Bk":
			case "bk":
				name[0]="Bk";
				name[1]= "247";
			break;
			case "Cf":
			case "cf":
				name[0]="Cf";
				name[1]= "251";
			break;
			case "Es":
			case "es":
				name[0]="Es";
				name[1]= "252";
			break;
			case "Fm":
			case "fm":
				name[0]="Fm";
				name[1]= "257";
			break;
			case "Md":
			case "md":
				name[0]="Md";
				name[1]= "258";
			break;
			case "No":
			case "no":
				name[0]="No";
				name[1]= "259";
			break;
			case "Lr":
			case "lr":
				name[0]="Lr";
				name[1]= "262";
			break;
			case "Rf":
			case "rf":
				name[0]="Rf";
				name[1]= "261";
			break;
			case "Db":
			case "db":
				name[0]="Db";
				name[1]= "262";
			break;
			case "Sg":
			case "sg":
				name[0]="Sg";
				name[1]= "263";
			break;
			case "bh":
			case "Bh":
				name[0]="Bh";
				name[1]= "262";
			break;
			case "Hs":
			case "hs":
				name[0]="Hs";
				name[1]= "265";
			break;
			case "Mt":
			case "mt":
				name[0]="Mt";
				name[1]= "266";
			break;
					}
		
	
		return name;
	}
}
