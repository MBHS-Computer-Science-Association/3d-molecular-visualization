#include <iostream>

#include <string>
#include "include/MyClass.h"
#include "include/Element.h"
#include "include/Reaction.h"

using namespace std;

int main()
{
    Element hydrogen = new Element(1);
    hydrogen.setAtomicNumber(1);
    cout << "The atomic number of hydrogen is: " <<
    hydrogen.getAtomicNumber() << endl;

    Reaction rxn;
    rxn.setRxnType("Redox");
    cout << rxn.getRxnType();

    cin.clear(); // reset any error flags
    cin.ignore(32767, '\n'); // ignore any characters in the input buffer until we find an enter character
    cin.get(); // get one more char from the user

    return 0;
}
