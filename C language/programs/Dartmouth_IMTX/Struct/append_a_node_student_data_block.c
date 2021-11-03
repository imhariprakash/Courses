struct student * append(struct student * end, struct student * newStudptr) {
    end->next = newStudptr;
    return(end->next);
}