
#include <string>

#ifndef REACTION_H
#define REACTION_H

class Reaction
{
public:
    std::string type;
    void setRxnType(std::string rxn);
    std::string getRxnType();
};
#endif // REACTION_H
