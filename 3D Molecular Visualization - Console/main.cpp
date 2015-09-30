#include <iostream>
#include "include/MyClass.h"
#include "include/Element.h"

using namespace std;

int main()
{
    int a[100];

    Element hydrogen;
    hydrogen.setAtomicNumber(1);
    cout << "The atomic number of hydrogen is: " <<
    hydrogen.getAtomicNumber() << endl;

    MyClass b;
    cout << b.add() << endl;

    for(int i = 0; i <= 100; i++)
    {
        cout<<i<< " ";
    }

    cin.clear(); // reset any error flags
    cin.ignore(32767, '\n'); // ignore any characters in the input buffer until we find an enter character
    cin.get(); // get one more char from the user

    return 0;
}
