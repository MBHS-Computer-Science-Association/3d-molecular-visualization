#include <iostream>

#include <string>
#include "include/MyClass.h"
#include "include/Element.h"

using namespace std;

int main()
{
    int value = 2;
    Element hydrogen;
    hydrogen.setAtomicNumber(1);
    cout << "The atomic number of hydrogen is: " <<
    hydrogen.getAtomicNumber() << endl;

    cin.clear(); // reset any error flags
    cin.ignore(32767, '\n'); // ignore any characters in the input buffer until we find an enter character
    cin.get(); // get one more char from the user

    return 0;
}
