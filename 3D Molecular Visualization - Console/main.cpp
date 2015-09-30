#include <iostream>

using namespace std;

class Element
{
public:
    int atomicNumber;
    int getAtomicNumber()
    {
        return atomicNumber;
    }
};

int main()
{
    int a[100];

    Element hydrogen;
    hydrogen.atomicNumber = 1;
    cout << "The atomic number of hydrogen is" <<
    hydrogen.getAtomicNumber() << endl;

    for(int i = 0; i <= 100; i++)
    {
        cout<<i<< " ";
    }

    cin.clear(); // reset any error flags
    cin.ignore(32767, '\n'); // ignore any characters in the input buffer until we find an enter character
    cin.get(); // get one more char from the user

    return 0;
}
