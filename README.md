SyVOLTEditor
==============

This project holds the source code for a visual editor of SyVOLT specifications.

SyVOLT (SYmbolic Verification Of modeL Transformations) is symbolic execution based technique that [Levi Lucio](http://msdl.cs.mcgill.ca/people/levi) has developed for proving syntax model relation properties of model transformations. Such properties are expressed as in the literature as precondition-postcondition axioms involving statements about the syntactic structure of the input and output models of a transformation. The theory behind the approach is described [here](http://msdl.cs.mcgill.ca/people/levi/files/paper_models2010.pdf). We have proved that the symbolic execution of any [DSLTrans](https://github.com/githubbrunob/DSLTransGIT) model transformation is a finite object. The theory capitalises on the fact that transformations written in [DSLTrans](https://github.com/githubbrunob/DSLTransGIT) terminate and are confluent by construction.

Based on the theory mentioned above [Levi Lucio](http://msdl.cs.mcgill.ca/people/levi) built a Python based prototype of the approach based on the [T-Core](http://syriani.cs.ua.edu/files/tcore_package.zip) model transformation framework.
The prototype has been developed according to Model Driven Development (MDD) principles and uses [AToM3](http://atom3.cs.mcgill.ca/) for metamodelling and modelling the necessary artifacts. The symbolic execution construction, property proof algorithms and experiment results are described in detail [here](http://msdl.cs.mcgill.ca/people/levi/files/MTSymbExec.pdf). Note that the SyVOLT software is distributed as a means to replicate our experiments and not as a fully functional tool.

Download the SyVOLT experiments [here](http://msdl.cs.mcgill.ca/people/levi/files/SyVOLT.zip).


Installation
-------------------

This editor is distributed as an eclipse plugin and works in all major operating systems. You can download eclipse modelling tools from [https://eclipse.org/](https://eclipse.org/).

You can install it through the update site:
https://www.dropbox.com/s/l0i6zjxkrk3brzd/site.xml (This is just the [SyVoltSyntaxUpdateSite](./SyVoltSyntaxUpdateSite) directory contents).

