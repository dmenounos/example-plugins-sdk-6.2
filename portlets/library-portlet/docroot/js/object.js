function Obj(config)
{
	Obj.copy(this, config);

	if (this.init) {
		this.init();
	}
}

Obj.copy = function(targetObject, sourceObject)
{
	if (!targetObject) {
		targetObject = {};
	}

	if (sourceObject) {
		for (var property in sourceObject) {
			targetObject[property] = sourceObject[property];
		}
	}

	return targetObject;
}

Obj.extend = function(superClass, subClassDefinition)
{
	// Create a substitute constructor for the super class.
	// It is empty, thus requires no arguments and avoids side effects.
	var superClassSubstitute = function() {};

	// It uses the same prototype instance as the actual super class.
	superClassSubstitute.prototype = superClass.prototype;

	// Create the constructor for our sub class.
	var subClass = function() {
		// Call the super class constructor.
		superClass.apply(this, arguments);
	};

	// Create an instance of the super class for our prototype.
	subClass.prototype = new superClassSubstitute();
	subClass.superClass = superClass;

	Obj.copy(subClass.prototype, subClassDefinition);

	return subClass;
}
